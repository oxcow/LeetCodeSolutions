package com.leetcode.oj.problem.solution.easy;

import java.util.Arrays;

/**
 * URL: <a href="https://leetcode.com/problems/valid-anagram/">Valid Anagram</a>
 * <p>
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * <p>
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * <p>
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * <p>
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 * <p>
 * Created by leeyee on 2016/03/02.
 */
public class ValidAnagram {

    // TODO: Arrays.sort()不够快，能被优化
    // TODO: 未考虑unicode编码情况
    public boolean isAnagram(String s, String t) {

        if (s == null || t == null) return false;

        if (s.length() != t.length()) return false;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i] != tChars[i]) {
                return false;
            }
        }

        return true;

    }
}
