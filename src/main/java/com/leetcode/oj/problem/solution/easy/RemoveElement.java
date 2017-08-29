package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/remove-element/description/">Remove Element</a>
 * <p>
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 2.
 * <p>
 * Created by wli on 2017-08-29.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (val == nums[i]) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != nums[i]) {
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                        break;
                    }
                }
            }
        }
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                ++len;
            } else {
                break;
            }
        }
        return len;
    }
}
