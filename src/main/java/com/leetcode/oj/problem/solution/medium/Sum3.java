package com.leetcode.oj.problem.solution.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
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

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        Map<String, List<Integer>> subTreeSumMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> subTreeSums = new ArrayList<>(3);
                        subTreeSums.add(nums[i]);
                        subTreeSums.add(nums[j]);
                        subTreeSums.add(nums[k]);
                        subTreeSumMap.putIfAbsent(nums[i] + "" + nums[j] + "" + nums[k], subTreeSums);
                        logger.debug("match index: {},{},{} and map to triplet is {}", i, j, k, subTreeSums);
                    }
                }

            }
        }
        return new ArrayList<>(subTreeSumMap.values());
    }
}
