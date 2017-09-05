package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/convert-a-number-to-hexadecimal/description/">Convert a Number to Hexadecimal</a>
 * <p>
 * Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.
 * <p>
 * Note:
 * <p>
 * All letters in hexadecimal (a-f) must be in lowercase.
 * The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
 * The given number is guaranteed to fit within the range of a 32-bit signed integer.
 * You must not use any method provided by the library which converts/formats the number to hex directly.
 * Example 1:
 * <p>
 * Input:
 * 26
 * <p>
 * Output:
 * "1a"
 * Example 2:
 * <p>
 * Input:
 * -1
 * <p>
 * Output:
 * "ffffffff"
 * <p>
 * Created by leeyee on 2017/9/5 20:56.
 */
public class ConvertANumberToHexadecimal {
    final static char[] digits = {
            '0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'a', 'b',
            'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'
    };

    public String toHex(int val) {
        return Integer.toHexString(val);
    }

    public String toHex1(int num) {
        StringBuilder answer = new StringBuilder();
        if (num == 0) {
            return "0";
        }
        while (num != 0) {
            answer.insert(0, digits[(16 + num % 16) % 16]);
            num = num >>> 4;
        }
        return answer.toString();
    }
}
