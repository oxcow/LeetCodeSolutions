package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/search-insert-position/description/">Search Insert Position</a>
 * <p>
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 * <p>
 * Created by leeyee on 2017/8/11.
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int iLen = nums.length;

        if (iLen == 0 || target < nums[0]) return 0;

        if (target > nums[iLen - 1]) return iLen;

        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                idx = i;
                break;
            }
        }

        return idx;

    }
}
