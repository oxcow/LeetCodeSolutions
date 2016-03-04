package com.leetcode.oj.problem.solution.easy;

import java.util.Arrays;

/**
 * URL: <a href="https://leetcode.com/problems/contains-duplicate/">Contains Duplicate</a>
 * <p>
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * <p>
 * Created by leeyee on 2016/03/02.
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        if (nums.length < 2) return false;

        Arrays.sort(nums);

        int i = 0;

        while (true) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
            if (++i >= nums.length - 1) {
                return false;
            }
        }
    }
}
