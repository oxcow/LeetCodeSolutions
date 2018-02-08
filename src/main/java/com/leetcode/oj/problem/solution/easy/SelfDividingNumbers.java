package com.leetcode.oj.problem.solution.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * URL: <a href="https://leetcode.com/problems/self-dividing-numbers/description/">Self Dividing Numbers</a>
 * <p>
 * A self-dividing number is a number that is divisible by every digit it contains.
 * <p>
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * <p>
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * <p>
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 * <p>
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * Note:
 * <p>
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 * <p>
 * Created by wli on 2018-02-08.
 */
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        if (left < 1 || right > 10000) {
            throw new IllegalArgumentException("1 <= left <= right <= 10000");
        }
        List<Integer> selfDivNums = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumbers(i)) {
                selfDivNums.add(i);
            }
        }
        System.out.println(selfDivNums);
        return selfDivNums;
    }

    private boolean isSelfDividingNumbers(int number) {
        if (number < 10) return true;
        int numClone = number;
        while (number != 0) {
            int digit = number % 10;
            if (digit == 0 || numClone % digit != 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
