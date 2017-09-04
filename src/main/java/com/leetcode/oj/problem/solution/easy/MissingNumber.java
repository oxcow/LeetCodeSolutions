package com.leetcode.oj.problem.solution.easy;

import java.util.Arrays;

/**
 * URL: <a href="https://leetcode.com/problems/missing-number/description/">Missing Number</a>
 * <p>
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * <p>
 * For example,
 * Given nums = [0, 1, 3] return 2.
 * <p>
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 * <p>
 * Created by leeyee on 2017/09/04.
 */
public class MissingNumber {

    /**
     * Sort array firstly. Reverse cycle, compare nums[i] and len.
     * if equal, len decrement one;
     * if not equal then len is missing number.
     * <p>
     * Time complexity: be the same as Arrays.sort
     *
     * @param nums
     * @return missing number
     * @Excption RuntimeException if nums is null or length is 0
     */
    public int missingNumberByNormal(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new RuntimeException("array is null or length equals zero");
        }
        Arrays.sort(nums);
        int len = nums.length;
        int missNum = 0;
        for (int i = len - 1; i >= 0; --i) {
            if (nums[i] != len) {
                missNum = len;
            } else {
                --len;
            }
        }
        return missNum;
    }

    /**
     * missing numbers is (0+1+2+3+...+n) - (nums[0]+nums[1]+...+nums[len-1])
     * <p>
     * Time complexity: O(n)
     * <p>
     * Space complexity: O(1)
     *
     * @param nums
     * @return missing number
     * @Excption RuntimeException if nums is null or length is 0
     */
    public int missingNumberBySum(int... nums) {
        if (nums == null || nums.length == 0) {
            throw new RuntimeException("array is null or length equals zero");
        }
        int missNum = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missNum -= nums[i] - i;
        }
        return missNum;
    }

}
