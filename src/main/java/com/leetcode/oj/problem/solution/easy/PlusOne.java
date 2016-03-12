package com.leetcode.oj.problem.solution.easy;

import java.util.Stack;

/**
 * URL: <a href="https://leetcode.com/problems/plus-one/">Plus One</a>
 * <p>
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list.
 * <p>
 * Created by leeyee on 16-3-12.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        Stack<Integer> stack = new Stack<>();
        int mod = 1;
        for (int i = digits.length - 1; i >= 0; --i) {
            int digit = digits[i] + mod;
            stack.push(digit % 10);
            mod = digit / 10;
        }
        if (mod != 0) {
            stack.push(mod);
        }
        int iLen = stack.size();
        int[] result = new int[iLen];
        for (int i = 0; i < iLen; i++) {
            result[i] = stack.pop();
        }
        return result;
    }
}
