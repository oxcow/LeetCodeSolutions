package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/power-of-two/">Power of Two</a>
 * <p>
 * Given an integer, write a function to determine if it is a power of two.
 * <p>
 * Created by leeyee on 16-3-12.
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {

        int factor = 2;

        if (n == 0) return false;
        if (n == 1) return true;

        while (true) {

            if (n % factor != 0) return false;

            n >>= 1;

            if (n == 1) {
                return true;
            }
        }
    }
}
