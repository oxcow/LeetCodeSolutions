package com.leetcode.oj.problem.solution.medium;

import java.util.Arrays;

/**
 * URL: <a href="https://leetcode.com/problems/single-number-ii/#/description">Single Number II</a>
 * <p>
 * Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Created by leeyee on 2017/5/13.
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int single = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == single) {
                single = nums[i = i + 2];
            }else{
                break;
            }

        }
        return single;
    }
}
