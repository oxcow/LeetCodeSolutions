package com.leetcode.oj.problem.solution.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * URL: <a href="https://leetcode.com/problems/isomorphic-strings/description/">Isomorphic Strings</a>
 * <p>
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 * <p>
 * For example,
 * Given "egg", "add", return true.
 * <p>
 * Given "foo", "bar", return false.
 * <p>
 * Given "paper", "title", return true.
 * <p>
 * Note:
 * You may assume both s and t have the same length.
 * <p>
 * Created by wli on 2017-11-22.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return false;
        if (s.length() == t.length() && s.length() == 1) return true;

        String sMode = "", tMode = "";
        Map<Character, Integer> offsetMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            offsetMap.putIfAbsent(s.charAt(i), i);
            sMode += offsetMap.get(s.charAt(i));
        }
        System.out.println(sMode);
        offsetMap.clear();
        for (int i = 0; i < t.length(); i++) {
            offsetMap.putIfAbsent(t.charAt(i), i);
            tMode += offsetMap.get(t.charAt(i));;
        }
        System.out.println(tMode);
        return sMode.equals(tMode);
    }
}
