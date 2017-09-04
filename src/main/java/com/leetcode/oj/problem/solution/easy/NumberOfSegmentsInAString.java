package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/number-of-segments-in-a-string/description/">Number of Segments in a String</a>
 * <p>
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
 * <p>
 * Please note that the string does not contain any non-printable characters.
 * <p>
 * Example:
 * <p>
 * Input: "Hello, my name is John"
 * Output: 5
 * <p>
 * Created by wli on 2017-09-04.
 */
public class NumberOfSegmentsInAString {

    public int countSegments(String s) {

        if (s == null || s.length() == 0) return 0;

        int segment = 0;

        char[] chars = s.toCharArray();
        char preChar = chars[0];
        for (int i = 1; i < chars.length; i++) {
            char nextChar = chars[i];
            if (Character.isSpaceChar(nextChar)) {
                if (!Character.isSpaceChar(preChar)) {
                    ++segment;
                }
            }
            preChar = nextChar;
        }
        if (!Character.isSpaceChar(preChar)) {
            ++segment;
        }
        return segment;
    }
}
