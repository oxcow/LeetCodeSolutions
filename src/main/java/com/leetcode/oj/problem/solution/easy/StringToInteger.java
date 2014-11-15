package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://oj.leetcode.com/problems/string-to-integer-atoi/">string-to-integer-atoi</a>
 * <p/>
 * Implement atoi to convert a string to an integer.
 * <p/>
 * Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 * <p/>
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 * <p/>
 * spoilers alert... click to show requirements for atoi.
 * <p/>
 * Requirements for atoi:
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 * <p/>
 * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 * <p/>
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
 * <p/>
 * If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 * <p/>
 * Created by leeyee.li on 2014/11/14.
 */
public class StringToInteger {

    public static int atoi(String str) {

        int digit = 0;

        if (str == null || str.length() == 0) return digit;

        str = str.trim();

        boolean neg = false;

        if (str.charAt(0) == 43 || str.charAt(0) == 45) { //+ -
            neg = str.charAt(0) == 45;
            str = str.substring(1, str.length());
        }

        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57) { // 0-9

                c -= 48;

                if (neg) {
                    if (-digit < (Integer.MIN_VALUE + c) / 10) {
                        digit = Integer.MIN_VALUE;
                        break;
                    }
                } else {
                    if (digit > (Integer.MAX_VALUE - c) / 10) {
                        digit = Integer.MAX_VALUE;
                        break;
                    }
                }
                digit = c + digit * 10;
            } else {
                break;
            }
        }
        return neg ? -digit : digit;
    }
}
