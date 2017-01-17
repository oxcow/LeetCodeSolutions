package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/length-of-last-word/">Length of Last Word</a>
 * <p/>
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * <p/>
 * If the last word does not exist, return 0.
 * <p/>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * <p/>
 * For example,
 * Given s = "Hello World",
 * return 5.
 * <p/>
 * Created by leeyee.li on 2017/1/17.
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) return 0;
        int lastLen = 0;
        char[] chars = s.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                ++lastLen;
            } else {
                if (i != chars.length - 1 && chars[i + 1] != ' ') {
                    break;
                }
            }
        }
        return lastLen;
    }
}
