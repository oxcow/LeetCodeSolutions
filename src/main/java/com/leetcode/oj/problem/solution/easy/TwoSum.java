package com.leetcode.oj.problem.solution.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * URL: <a href="https://leetcode.com/problems/two-sum/#/description">Two Sum</a>
 * <p/>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * <p>
 * Created by leeyee on 2017/3/31.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int result[] = null;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result = new int[]{map.get(nums[i]), i};
                break;
            } else {
                map.put(target - nums[i], i);
            }
        }

        return result;
    }
}