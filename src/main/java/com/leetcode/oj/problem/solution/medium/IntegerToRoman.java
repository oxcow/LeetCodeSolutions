package com.leetcode.oj.problem.solution.medium;

/**
 * URL: <a href="https://oj.leetcode.com/problems/integer-to-roman/">integer-to-roman</a>
 * <p/>
 * Given an integer, convert it to a roman numeral.
 * <p/>
 * Input is guaranteed to be within the range from 1 to 3999.
 * <p/>
 * 组数规则:
 * <ul>
 * <li>基本数字Ⅰ、X 、C 中的任何一个，自身连用构成数目，或者放在大数的右边连用构成数目，都不能超过三个；放在大数的左边只能用一个。</li>
 * <li>不能把基本数字V 、L 、D 中的任何一个作为小数放在大数的左边采用相减的方法构成数目；放在大数的右边采用相加的方式构成数目，只能使用一个。</li>
 * <li>V 和X 左边的小数字只能用Ⅰ。</li>
 * <li>L 和C 左边的小数字只能用X。</li>
 * <li>D 和M 左边的小数字只能用C。</li>
 * </ul>
 * Created by leeyee.li on 2015/01/14.
 */
public class IntegerToRoman {

    public static final String[] COMMON_ROMAN = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    public static final int[] COMMON_ROMAN_INT = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

    public static int indexOf(int num) {

        if (num >= 1000)
            return COMMON_ROMAN.length - 1;

        int indexOfNum = -1;

        for (int i = 0; i < COMMON_ROMAN_INT.length - 1; i++) {
            int start = COMMON_ROMAN_INT[i];
            int end = COMMON_ROMAN_INT[i + 1];

            if (num == start)
                return i;
            if (num == end)
                return i + 1;

            if (num > start && num < end) {
                return i;
            }

        }
        return indexOfNum;
    }

    public static String intToRoman(int num) {

        if (num < 1 && num > 4000) return null;

        String romanString = "";

        while (num != 0) {

            int idx = indexOf(num);

            if (idx != -1) {

                num = num - COMMON_ROMAN_INT[idx];

                romanString = romanString + COMMON_ROMAN[idx];

                num = Math.abs(num);

            }
        }

        return romanString;
    }
}

