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

    public boolean isPowerOfTwoNoLoop(int n) {
        if (n == 1) return true;
        if (n < 2) return false;

        // 找到2的n次方最大的整数，用待检测数取余，结果等于0则肯定是2的n次方
        int maxIntPowOfTwo = 1073741824; // 2^30
        return maxIntPowOfTwo % n == 0;
    }
}
