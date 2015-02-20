package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://oj.leetcode.com/problems/excel-sheet-column-title/">excel-sheet-column-title</a>
 * <p/>
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * <p/>
 * For example:
 * <pre>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * ...
 * 16384 -> XFD
 * </pre>
 * Created by leeyee.li on 2015/2/17.
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        if (n < 1 && n > 16384) return null; // Excel 2007 row title from 'A' to 'XFD'
        String columnTitle = "";
        while (n > 26) {
            int mod = n % 26;
            if (mod == 0) {
                mod = 26;
                n = n - 26;
            }
            n = n / 26;
            columnTitle = (char) (mod + 64) + columnTitle;
        }
        return (char) (n + 64) + columnTitle;
    }

    /**
     * validate method
     *
     * @param str
     * @return
     */
    public long getRowNum(String str) {
        long rowNum = 0L;
        int iLen = str.length();
        for (int i = 0; i < iLen; i++) {
            rowNum += (Integer.valueOf(str.charAt(i)) - 64) * (long) Math.pow(26, iLen - 1 - i);
        }
        return rowNum;
    }
}
