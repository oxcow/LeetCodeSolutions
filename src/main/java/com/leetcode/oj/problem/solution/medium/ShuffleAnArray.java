package com.leetcode.oj.problem.solution.medium;

import java.util.Random;

/**
 * URL: <a href="https://leetcode.com/problems/shuffle-an-array/description/">Shuffle an Array</a>
 * <p>
 * Shuffle a set of numbers without duplicates.
 * <p>
 * Example:
 * <pre>
 * // Init an array with set 1, 2, and 3.
 * int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 *
 * // Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
 * solution.shuffle();
 *
 * // Resets the array back to its original configuration [1,2,3].
 * solution.reset();
 *
 * // Returns the random shuffling of array [1,2,3].
 * solution.shuffle();
 * </pre>
 * <p>
 * Created by wli on 2017-09-08.
 */
public class ShuffleAnArray {
    private int[] nums;
    private Random random;

    public ShuffleAnArray(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return nums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        if (nums == null) return null;
        int[] clone = nums.clone();
        for (int i = 1; i < clone.length; i++) {
            int j = random.nextInt(i + 1);
            int tmp = clone[j];
            clone[j] = clone[i];
            clone[i] = tmp;
        }
        return clone;
    }
}
