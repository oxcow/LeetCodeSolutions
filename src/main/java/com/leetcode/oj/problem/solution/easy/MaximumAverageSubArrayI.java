package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/maximum-average-subarray-i/description/">Maximum Average Subarray I</a>
 * <p>
 * Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.
 * <p>
 * Example 1:
 * Input: [1,12,-5,-6,50,3], k = 4
 * Output: 12.75
 * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 * Note:
 * 1 <= k <= n <= 30,000.
 * Elements of the given array will be in the range [-10,000, 10,000].
 * <p>
 * Created by wli on 2017-09-04.
 */
public class MaximumAverageSubArrayI {

    public double findMaxAverage(int[] nums, int k) {

        if (nums == null || nums.length < k || k < 1) {
            throw new RuntimeException("1 <= k <= n <= 30,000.");
        }

        double preSumCache = 0;
        for (int i = 0; i < k; i++) {
            preSumCache += nums[i];
        }

        double maxAvg = preSumCache / k;
        for (int i = 1; i < nums.length - k + 1; i++) {
            preSumCache = preSumCache - nums[i - 1] + nums[i + k - 1];
            maxAvg = Math.max(preSumCache / k, maxAvg);
        }
        return maxAvg;
    }
}
