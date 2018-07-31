package com.leetcode.oj.problem.solution.medium;

/**
 * URL: <a href="https://leetcode.com/problems/container-with-most-water/description/">Container With Most Water</a>
 * <p>
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * <p>
 * Note: You may not slant the container and n is at least 2.
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 * <p>
 * <p>
 * <p>
 * Example:
 * <p>
 * Input: [1,8,6,2,5,4,8,3,7]
 * Output: 49
 */
public class ContainerWithMostWater {

    // TODO: nest loop. need to optimization algorithm
    public int maxArea(int[] height) {

        int max = 0;

        for (int i = 0; i < height.length; i++) {

            int a = height[i];

            for (int j = i + 1; j < height.length; j++) {

                int b = height[j];

                max = Math.max(max, Math.min(a, b) * (j - i));
            }

        }

        return max;
    }
}
