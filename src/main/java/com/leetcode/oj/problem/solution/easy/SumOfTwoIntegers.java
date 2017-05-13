package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/sum-of-two-integers/#/description">Sum of Two Integers</a>
 * <p>
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * <p>
 * Example:
 * Given a = 1 and b = 2, return 3.
 * <p>
 * Credits:
 * Special thanks to @fujiaozhu for adding this problem and creating all test cases.
 * <p>
 * Created by leeyee on 2017/5/13.
 */
public class SumOfTwoIntegers {

    public int getSum(int a, int b) {
        if (b == 0) return a;

        int sum = a ^ b;
        int carry = (a & b) << 1;
        return getSum(sum, carry);
    }
}
