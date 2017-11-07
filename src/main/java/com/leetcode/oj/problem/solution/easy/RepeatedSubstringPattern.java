package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/repeated-substring-pattern/description/">Repeated Substring Pattern</a>
 * <p>
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
 * <p>
 * Example 1:
 * Input: "abab"
 * <p>
 * Output: True
 * <p>
 * Explanation: It's the substring "ab" twice.
 * Example 2:
 * Input: "aba"
 * <p>
 * Output: False
 * Example 3:
 * Input: "abcabcabcabc"
 * <p>
 * Output: True
 * <p>
 * Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 * <p>
 * Created by wli on 2017-11-07.
 */
public class RepeatedSubstringPattern {
    //TODO: need Algorithm optimization
    public boolean repeatedSubstringPattern(String s) {
        boolean isRep = true;

        int subStrPatternLen = 1, iLen = s.length();

        if (iLen == 1) return false;

        String subStrPatt = s.substring(0, subStrPatternLen);

        for (int i = subStrPatternLen; i < iLen; ) {
            if (subStrPatternLen == iLen) {
                isRep = s.equals(subStrPatternLen);
                break;
            }
            if (subStrPatternLen > iLen || i + subStrPatternLen > iLen) {
                isRep = false;
                break;
            }
            boolean isEq = s.substring(i, i + subStrPatternLen).equals(subStrPatt);
            if (!isEq) {
                ++subStrPatternLen;
                i = subStrPatternLen;
                subStrPatt = s.substring(0, subStrPatternLen);
                isRep = false;
            } else {
                i += subStrPatternLen;
                isRep = true;
            }
        }
        return isRep;
    }
}
