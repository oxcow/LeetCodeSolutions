package com.leetcode.oj.problem.solution.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * URL: <a href="https://leetcode.com/problems/3sum/description/">3Sum</a>
 * <p>
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate triplets.
 * <p>
 * Example:
 * <p>
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
public class Sum3 {

    private static final Logger logger = LoggerFactory.getLogger(Sum3.class);

    /**
     * 暴力求和。O(N*(N-1)*(N-2))
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Map<String, List<Integer>> subTreeSumMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        subTreeSumMap.putIfAbsent(nums[i] + "" + nums[j] + "" + nums[k], createSubTree(nums[i], nums[j], nums[k]));
                        //logger.debug("match index: {},{},{} and map to triplet is {}", i, j, k, subTreeSums);
                    }
                }

            }
        }
        return new ArrayList<>(subTreeSumMap.values());
    }

    /**
     * O(N*(N-1))
     * <p>
     * 三元组去重使用Map方式
     *
     * @param nums
     * @return
     * @see com.leetcode.oj.problem.solution.medium.Sum3#threeSumByDoubleLoop1(int[])
     */
    public List<List<Integer>> threeSumByDoubleLoop(int[] nums) {

        // array length lt 3, return empty list.
        if (nums.length < 3) {
            return new ArrayList<>(0);
        }

        // sort array
        Arrays.sort(nums);

        List<Integer> eqZeros = new ArrayList<>();
        List<Integer> gtZeros = new ArrayList<>();
        List<Integer> ltZeros = new ArrayList<>();
        BitSet ltZeroBitSet = new BitSet();
        BitSet gtZeroBitSet = new BitSet();

        for (int num : nums) {
            if (num == 0) {
                eqZeros.add(0);
            } else if (num > 0) {
                gtZeros.add(num);
                gtZeroBitSet.set(num);
            } else {
                ltZeros.add(num);
                ltZeroBitSet.set(-num);
            }
        }

        // 如果零元素集合为空，且大于零元素集合或小于零元素集合有一个为空，则返回空
        if ((gtZeros.isEmpty() || ltZeros.isEmpty()) && eqZeros.isEmpty()) {
            return new ArrayList<>(0);
        }

        Map<String, List<Integer>> subTreeSumMap = new HashMap<>();

        // 如果零集合中零元素的大于2个，那么结果集中存在[0,0,0]元组
        if (eqZeros.size() > 2) {
            subTreeSumMap.put("000", createSubTree(0, 0, 0));
        }

        // 构建大于等于零元素数组
        eqZeros.addAll(gtZeros);
        List<Integer> geZeros = eqZeros;
        gtZeroBitSet.set(0);

        // ltZeros[i] + ltZeros[j] == -geZeros[n]
        for (int i = 0; i < ltZeros.size(); i++) {
            for (int j = i + 1; j < ltZeros.size(); j++) {
                if (gtZeroBitSet.get(-ltZeros.get(i) - ltZeros.get(j))) {
                    subTreeSumMap.put(ltZeros.get(i) + "" + ltZeros.get(j)
                            , createSubTree(ltZeros.get(i), ltZeros.get(j), -ltZeros.get(i) - ltZeros.get(j)));
                }
            }
        }

        // geZeros[i] + geZeros[j] == -ltZeros[n]
        for (int i = 0; i < geZeros.size(); i++) {
            for (int j = i + 1; j < geZeros.size(); j++) {
                if (ltZeroBitSet.get(geZeros.get(i) + geZeros.get(j))) {
                    subTreeSumMap.put(geZeros.get(i) + "" + geZeros.get(j)
                            , createSubTree(-geZeros.get(i) - geZeros.get(j), geZeros.get(i), geZeros.get(j)));
                }
            }
        }

        return new ArrayList<>(subTreeSumMap.values());
    }

    /**
     * O(N*(N-1))
     * <p>
     * 内部不使用Map进行三元组去重，减少内存开销
     *
     * @param nums
     * @return
     * @see com.leetcode.oj.problem.solution.medium.Sum3#threeSumByDoubleLoop(int[])
     */
    public List<List<Integer>> threeSumByDoubleLoop1(int[] nums) {
        // array length lt 3, return empty list.
        if (nums.length < 3) {
            return new ArrayList<>(0);
        }
        // sort array
        Arrays.sort(nums);

        List<Integer> eqZeros = new ArrayList<>();
        List<Integer> gtZeros = new ArrayList<>();
        List<Integer> ltZeros = new ArrayList<>();
        BitSet ltZeroBitSet = new BitSet();
        BitSet gtZeroBitSet = new BitSet();

        for (int num : nums) {
            if (num == 0) {
                eqZeros.add(0);
            } else if (num > 0) {
                gtZeros.add(num);
                gtZeroBitSet.set(num);
            } else {
                ltZeros.add(num);
                ltZeroBitSet.set(-num);
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        if (!eqZeros.isEmpty()) {
            if (eqZeros.size() > 2)
                result.add(createSubTree(0, 0, 0));
            gtZeros.add(0);
            gtZeroBitSet.set(0);
        }

        Integer a = null, b = null;

        for (int i = 0; i < ltZeros.size(); i++) {
            if (ltZeros.get(i).equals(a)) { // 相邻元素相同，则为重复元组
                continue;
            }
            for (int j = i + 1; j < ltZeros.size(); j++) {
                if (ltZeros.get(j).equals(b)) { // 下一个元素与前一个元素相同时，则组层元组与之前重复
                    continue;
                }
                if (gtZeroBitSet.get(-ltZeros.get(i) - ltZeros.get(j))) {
                    a = ltZeros.get(i);
                    b = ltZeros.get(j);
                    result.add(createSubTree(ltZeros.get(i), ltZeros.get(j), -ltZeros.get(i) - ltZeros.get(j)));
                }
            }
            // clean b and ready for next loop
            b = null;
        }

        for (int i = 0; i < gtZeros.size(); i++) {
            if (gtZeros.get(i).equals(a)) {
                continue;
            }
            for (int j = i + 1; j < gtZeros.size(); j++) {
                if (gtZeros.get(j).equals(b)) {
                    continue;
                }
                if (ltZeroBitSet.get(gtZeros.get(i) + gtZeros.get(j))) {
                    a = gtZeros.get(i);
                    b = gtZeros.get(j);
                    result.add(createSubTree(-gtZeros.get(i) - gtZeros.get(j), gtZeros.get(i), gtZeros.get(j)));
                }
            }
            b = null;
        }
        return result;
    }

    private List<Integer> createSubTree(Integer a, Integer b, Integer c) {
        List<Integer> subTreeSums = new ArrayList<>(3);
        subTreeSums.add(a);
        subTreeSums.add(b);
        subTreeSums.add(c);
        return subTreeSums;
    }
}
