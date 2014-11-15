package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://oj.leetcode.com/problems/roman-to-integer/">roman-to-integer</a>
 * <p/>
 * <p/>
 * Given a <a href="http://baike.baidu.com/view/42061.htm">roman</a> numeral, convert it to an integer.
 * <p/>
 * Input is guaranteed to be within the range from 1 to 3999.
 * <p/>
 * Created by leeyee.li on 2014/11/15.
 */
public class RomanToInteger {
    public static final String BASE_ROMAN = "IVXLCDM";
    public static final int[] ROMAN_INT = {1, 5, 10, 50, 100, 500, 1000};

    public static int intVal(char chr) {
        return ROMAN_INT[BASE_ROMAN.indexOf(Character.toUpperCase(chr))];
    }

    /**
     * Make sure the input string is a roman numeral
     *
     * @param str roman numeral
     * @return int
     */
    public static int romanToInt(String str) {
        int digit = 0;
        int iLen = str.length();
        for (int i = 0; i < iLen; ++i) {

            int vInt = intVal(str.charAt(i));

            if (i + 1 < iLen) {
                char nextRomanChar = str.charAt(i + 1);
                if (vInt < intVal(nextRomanChar)) {
                    vInt = -vInt;
                }
            }

            digit += vInt;
        }
        return digit;
    }
}
