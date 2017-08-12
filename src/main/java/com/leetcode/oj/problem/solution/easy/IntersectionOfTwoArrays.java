package com.leetcode.oj.problem.solution.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * URL: <a href="https://leetcode.com/problems/intersection-of-two-arrays/description/">Intersection of Two Arrays</a>
 * <p>
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * <p>
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 * <p>
 * Created by leeyee on 2017/8/12.
 */
public class IntersectionOfTwoArrays {

    public static final int[] EMPTY_INT = new int[]{};

    public int[] intersection(int[] nums1, int[] nums2) {

        if (nums1 == null || nums2 == null) return EMPTY_INT;

        int len1 = nums1.length, len2 = nums2.length;

        if (len1 == 1 && len1 == len2) {
            return nums1[0] != nums2[0] ? EMPTY_INT : nums1;
        }


        int[] outerLoopNums;
        int[] innerLoopNums = len1 >= len2 ? nums1 : nums2;
        if (innerLoopNums != nums1) {
            outerLoopNums = nums1;
        } else {
            outerLoopNums = nums2;
        }


        Set<Integer> interSet = new HashSet<>();

        for (int outerLoopNum : outerLoopNums) {

            for (int innerLoopNum : innerLoopNums) {

                if (outerLoopNum == innerLoopNum) {
                    interSet.add(outerLoopNum);
                    break;
                }
            }

        }

        return interSet.size() == 0 ? EMPTY_INT : interSet.stream().mapToInt(Number::intValue).toArray();
    }


}
