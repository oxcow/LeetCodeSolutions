package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://oj.leetcode.com/problems/excel-sheet-column-number/">Excel Sheet Column Number </a>
 * <p/>
 * Related to question Excel Sheet Column Title
 * <p/>
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * <p/>
 * For example:
 * <pre>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * </pre>
 * Created by leeyee.li on 2015/2/20.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String str) {
        if (str == null || str.trim().equals("")) return 0; // simple validate
        int rowNum = 0;
        for (int i = 0; i < str.length(); i++) {
            // rowNum += (Integer.valueOf(str.charAt(i)) - 64) * (long) Math.pow(26, iLen - 1 - i);
            rowNum = rowNum * 26 + (Integer.valueOf(str.charAt(i)) - 64); // Ignore Integer Overflow
        }
        return rowNum;
    }
}
