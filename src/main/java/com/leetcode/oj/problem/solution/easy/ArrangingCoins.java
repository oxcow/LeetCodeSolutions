package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/arranging-coins/description/">Arranging Coins</a>
 * <p>
 * You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
 * <p>
 * Given n, find the total number of full staircase rows that can be formed.
 * <p>
 * n is a non-negative integer and fits within the range of a 32-bit signed integer.
 * <p>
 * Example 1:
 * <p>
 * n = 5
 * <p>
 * The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤
 * <p>
 * Because the 3rd row is incomplete, we return 2.
 * Example 2:
 * <p>
 * n = 8
 * <p>
 * The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤ ¤
 * ¤ ¤
 * <p>
 * Because the 4th row is incomplete, we return 3.
 * <p>
 * Created by wli on 2017-09-05.
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int storey = 0;
        while (true) {
            if (n > storey) {
                ++storey;
                n -= storey;
            } else {
                break;
            }
        }
        return storey;
    }

    /**
     * TODO: find every row num from x to y
     *
     * 1: 1
     * 2: 2 3
     * 3: 4 5 6
     * 4: 7 8 9 10
     * 5: 11 12 13 14
     *
     * [1,2,4,7,11]  ==>  An = A(n-1) + n -1
     * [1,3,6,10,14] => An = A(n-1) + n -1
     *
     */
}
