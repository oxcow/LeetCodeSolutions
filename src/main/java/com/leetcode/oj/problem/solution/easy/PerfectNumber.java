package com.leetcode.oj.problem.solution.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * URL: <a href="https://leetcode.com/problems/perfect-number/description/">Perfect Number</a>
 * <p>
 * We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.
 * <p>
 * Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.
 * Example:
 * Input: 28
 * Output: True
 * Explanation: 28 = 1 + 2 + 4 + 7 + 14
 * Note: The input number n will not exceed 100,000,000. (1e8)
 * <p>
 * Created by wli on 2018-02-08.
 */
public class PerfectNumber {

    public boolean checkPerfectNumber(int num) {

        if (num < 2) return false;

        if (num > 100_000_000) {
            throw new IllegalArgumentException("The input number n will not exceed 100,000,000");
        }

        int sum = 1, start = 2, end = num - 1;

        while (start < end) {
            if (num % start == 0) {
                sum += start + num / start;
                if (sum > num) {
                    return false;
                }
                end = num / start - 1;
            } else {
                --end;
            }
            ++start;
        }
        return num == sum;
    }

    // 获取除本身之外的因子。返回因子是有序的
    public List<Integer> getAllPositiveDivisorExceptSelf(int number) {

        List<Integer> divisors = new ArrayList<>();

        if (number == 1) return divisors;

        divisors.add(1);

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    // 获取除本身之外的因子。返回因子是无序的
    public List<Integer> getAllPositiveDivisorExceptSelf1(int num) {
        List<Integer> divisors = new ArrayList<>();
        if (num == 1) return divisors;

        divisors.add(1);
        int start = 2, end = num - 1;
        while (start < end) {
            if (num % start == 0) {
                divisors.add(start);
                divisors.add(num / start);
                end = num / start - 1;
            } else {
                --end;
            }
            ++start;
        }
        return divisors;
    }
}
