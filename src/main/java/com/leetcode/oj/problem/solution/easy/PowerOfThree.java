package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/power-of-three/">Power of Three</a>
 * <p>
 * Given an integer, write a function to determine if it is a power of three.
 * <p>
 * Follow up:
 * Could you do it without using any loop / recursion?
 * <p>
 * Created by leeyee on 16-3-12.
 */
public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        int factor = 3;

        if (n == 1) return true;

        if (n < factor) return false;

        while (true) {

            if (n % factor != 0) return false;

            n /= 3;

            if (n == 1) {
                return true;
            }
        }
    }

    public boolean isPowerOfThreeNoLoop(int n) {
        if (n == 1) return true;
        if (n < 3) return false;
        // 找到3的n次方最大的整数，用待检测数取余，结果等于0则肯定是3的n次方
        int maxIntPowOfThree = 1162261467; // 2^19
        return maxIntPowOfThree % n == 0;
    }
}
