package com.leetcode.oj.problem.solution.easy;

import java.util.Arrays;

/**
 * URL: <a href="https://leetcode.com/problems/single-number/#/description">Single Number</a>
 * <p>
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Created by leeyee on 2017/5/13.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int first = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (first != nums[i]) {
                return first;
            } else {
                first = nums[++i];
            }
        }
        return first;
    }
}
