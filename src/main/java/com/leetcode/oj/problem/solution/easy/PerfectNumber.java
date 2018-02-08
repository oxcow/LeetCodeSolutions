package com.leetcode.oj.problem.solution.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wli on 2018-02-08.
 */
public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num < 1 || num > 100_000_000) {
            throw new IllegalArgumentException("The input number n will not exceed 100,000,000");
        }
        int sum = 1;
        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                sum += divisor;
            }
            if (sum > num) {
                return false;
            }
        }
        return num == sum;
    }

    public List<Integer> getAllPositiveDivisorExceptSelf(int number) {

        List<Integer> divisors = new ArrayList<>();
        divisors.add(1);

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

}
