package com.leetcode.oj.problem.solution.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * URL: <a href="https://leetcode.com/problems/rotate-array/description/">Rotate Array</a>
 * <p>
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 * <p>
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * Note:
 * <p>
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 */
public class RotateArray {

    private static final Logger LOGGER = LoggerFactory.getLogger(RotateArray.class);

    // Runtime: O(n * k), Space: O(1). n = nums.length
    public void rotate(int[] nums, int k) {

        int len = nums.length;

        int rightSteps = k % len;

        LOGGER.debug("Input nums={}, need move {}, actual need {}", nums, k, rightSteps);

        for (int l = 0; l < rightSteps; l++) {
            int firstElement = nums[0];
            for (int i = len - 1; i >= 0; i--) {
                if (i + 1 == len) {
                    nums[0] = nums[i];
                } else if (i == 0) {
                    nums[1] = firstElement;
                } else {
                    nums[i + 1] = nums[i];
                }
            }
            LOGGER.debug("Right move {}, {}", (l + 1), nums);
        }
    }

    // Runtime: O(n), Space: O(n). n = nums.length
    public void rotateBySpaceN(int[] nums, int k) {

        int len = nums.length;

        k %= len;

        int a[] = new int[len];

        for (int i = 0; i < len; i++) {
            if (i + k < len) {
                a[i + k] = nums[i];
            } else {
                a[k - len + i] = nums[i];
            }
        }

        for (int i = 0; i < len; i++) {
            nums[i] = a[i];
        }
    }

    // Runtime: O(n-k), Space: O(k). n = nums.length
    public void rotateBySpaceK(int[] nums, int k) {

        int len = nums.length;

        k %= len;

        int temp[] = new int[k];

        for (int i = len - k; i < len; i++) {
            temp[i + k - len] = nums[i];
        }

        for (int i = len - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

    }
}
