package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/house-robber/description/">House Robber</a>
 * <p>
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 * <p>
 * Created by wli on 2017-08-30.
 */
public class HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int houseNum = nums.length;
        if (houseNum == 1) return nums[0];
        if (houseNum == 2) return Math.max(nums[0], nums[1]);

        int rob = nums[1], nRob = nums[0];
        for (int i = 2; i < houseNum; i++) {
            int curRob = nRob + nums[i];
            nRob = Math.max(rob, nRob);
            rob = curRob;
        }
        return Math.max(rob, nRob);
    }
}
