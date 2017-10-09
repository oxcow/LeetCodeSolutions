package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/ugly-number/description/">Ugly Number</a>
 * <p>
 * Write a program to check whether a given number is an ugly number.
 * <p>
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
 * <p>
 * Note that 1 is typically treated as an ugly number.
 * <p>
 * Created by leeyee on 2017/7/30.
 */
public class UglyNumber {

    public boolean isUgly(int num) {

        for (int i = 2; i < 6 ; i++) {
            while (num % i == 0) num /= i;
        }

        return num == 1;

    }

}