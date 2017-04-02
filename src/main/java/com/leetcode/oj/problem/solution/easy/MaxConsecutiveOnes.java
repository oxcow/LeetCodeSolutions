package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/max-consecutive-ones/">Max Consecutive Ones</a>
 * <p>
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * <p>
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 * Note:
 * <p>
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 * <p>
 * Created by leeyee on 2017/4/2.
 */
public class MaxConsecutiveOnes {

    // 时间复杂度O(n),空间复杂度O(n)
    public int findMaxConsecutiveOnes(int[] nums) {

        int consecutive = 0;
        int maxConsecutive = 0;
        for (int num : nums) {
            if (num == 1) {
                ++consecutive;
            } else {
                consecutive = 0;
            }
            if (consecutive > maxConsecutive) {
                maxConsecutive = consecutive;
            }
        }

        return maxConsecutive;
    }
}
