package com.leetcode.oj.problem.solution.medium;

/**
 * URL: <a href="https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/description/">Maximum XOR of Two Numbers in an Array</a>
 * <p>
 * Given a non-empty array of numbers, a0, a1, a2, … , an-1, where 0 ≤ ai < 231.
 * <p>
 * Find the maximum result of ai XOR aj, where 0 ≤ i, j < n.
 * <p>
 * Could you do this in O(n) runtime?
 * <p>
 * Example:
 * <pre>
 * Input: [3, 10, 5, 25, 2, 8]
 *
 * Output: 28
 *
 * Explanation: The maximum result is 5 ^ 25 = 28.
 * </pre>
 * Created by wli on 2017-09-08.
 */
public class MaximumXOROfTwoNumbersInAnArray {
    /**
     * simple loop.
     * <p>
     * Time complexity: O(n2)
     * Space Complexity: O(1)
     * <p>
     * TODO: try to time complexity to O(n)
     *
     * @param nums
     * @return
     */
    public int findMaximumXOR(int[] nums) {
        int maxXOR = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                maxXOR = Math.max(maxXOR, nums[i] ^ nums[j]);
            }
        }
        return maxXOR;
    }
}