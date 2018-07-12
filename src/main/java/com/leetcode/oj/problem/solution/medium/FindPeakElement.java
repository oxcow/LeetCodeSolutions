package com.leetcode.oj.problem.solution.medium;

/**
 * URL: <a href="https://leetcode.com/problems/find-peak-element/description/">Find Peak Element</a>
 * <p>
 * A peak element is an element that is greater than its neighbors.
 * <p>
 * Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.
 * <p>
 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 * <p>
 * You may imagine that nums[-1] = nums[n] = -∞.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index number 2.
 * Example 2:
 * <p>
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 1 or 5
 * Explanation: Your function can return either index number 1 where the peak element is 2,
 * or index number 5 where the peak element is 6.
 * Note:
 * <p>
 * Your solution should be in logarithmic complexity.
 *
 * @see com.leetcode.oj.problem.solution.easy.PeakIndexInAMountainArray
 */
public class FindPeakElement {
    // 如果数组元素是从小到大排列，则该算法具有最坏算法复杂度O(n)
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        int maxIdx = 0;
        int max = nums[0];
        for (int i = 1; i < len; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            } else {
                break;
            }
        }
        return maxIdx;
    }
}
