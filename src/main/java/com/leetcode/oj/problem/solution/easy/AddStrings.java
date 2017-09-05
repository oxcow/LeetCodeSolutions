package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/add-strings/description/">Add Strings</a>
 * <p>
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 * <p>
 * Note:
 * <p>
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 * <p>
 * Created by leeyee on 2017/09/05.
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {

        int len1 = num1.length(), len2 = num2.length();

        if (len1 == 0) return num2;
        if (len2 == 0) return num1;

        char[] num1Char = num1.toCharArray(), num2Char = num2.toCharArray();

        int carry = 0;
        String result = "";

        int aLen = len1 - 1, bLen = len2 - 1;
        for (int i = 0; i < Math.max(len1, len2); i++) {
            int a = aLen >= 0 ? num1Char[aLen--] - 48 : 0;
            int b = bLen >= 0 ? num2Char[bLen--] - 48 : 0;
            int v = a + b + carry;
            if (v >= 10) {
                carry = v / 10;
                v %= 10;
            } else {
                carry = 0;
            }
            result = v + result;
        }
        return carry == 0 ? result : carry + result;
    }
}
