package com.leetcode.oj.problem.solution.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

/**
 * URL: <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/description/"> Longest Substring Without Repeating Characters</a>
 * <p>
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Examples:
 * <p>
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * <p>
 * Given "bbbbb", the answer is "b", with the length of 1.
 * <p>
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * Created by wli on 2017-08-08.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        if (s == null) return 0;
        if (s.length() <= 1) return s.length();

        int maxLen = 1;
        String substring = s.charAt(0) + "";
        for (int i = 1; i < s.length(); i++) {
            int idx = substring.indexOf(s.charAt(i));
            if (idx != -1) {
                maxLen = Math.max(maxLen, substring.length());
                substring = substring.substring(idx + 1);
                --i; // repeat loop ones
            } else {
                substring += s.charAt(i);
            }
        }
        return Math.max(maxLen, substring.length());
    }
}

