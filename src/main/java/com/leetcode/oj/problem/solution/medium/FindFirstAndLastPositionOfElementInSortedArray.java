package com.leetcode.oj.problem.solution.medium;

/**
 * URL: <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/">Find First and Last Position of Element in Sorted Array</a>
 * <p>
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 * <p>
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * <p>
 * If the target is not found in the array, return [-1, -1].
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 * <p>
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[]{-1, -1};


        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > target) {
                break;
            }

            if (nums[i] == target) {
                if (result[0] == -1) {
                    result[0] = i;
                    continue;
                }
                result[1] = i;
            }
        }

        if (result[0] != -1 && result[1] == -1) {
            result[1] = result[0];
        }

        return result;
    }

}
