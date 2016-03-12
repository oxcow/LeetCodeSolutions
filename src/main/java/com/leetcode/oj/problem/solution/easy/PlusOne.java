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

        int mod = 0;
        int plusOne = ++digits[digits.length - 1];
        if (plusOne > 9) {
            mod = plusOne / 10;
            stack.push(plusOne % 10);
        } else {
            stack.push(plusOne);
        }
        for (int i = digits.length - 2; i >= 0; i--) {
            plusOne = digits[i] + mod;
            if (plusOne > 9) {
                mod = plusOne / 10;
                stack.push(plusOne % 10);
            } else {
                stack.push(plusOne);
                mod = 0;
            }
        }
        if (mod != 0) {
            stack.push(mod);
        }
        int size = stack.size();
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = stack.pop();
        }

        return result;
    }
}
