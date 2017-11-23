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
    /**
     * get the first index of each character in the string. if s.char.index ne t.char.index return false
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return false;
        if (s.length() == t.length() && s.length() == 1) return true;

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i), tChar = t.charAt(i);
            if (s.indexOf(sChar) != t.indexOf(tChar)) {
                return false;
            }
        }
        return true;
    }

    /**
     * s can be transfer to t through the mapping.
     * 1. compare char in the same position
     * 2. get map char by s.char, if map char is not null and map char is not eq t.char then return false;
     * 3. if map char is null, get map char by t.char, if map char is not null and map char is eq t.char then return false, else if map is contains value t.char then return false
     * 4. else, save map s.char to t.char
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphicByMap(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return false;
        if (s.length() == t.length() && s.length() == 1) return true;

        Map<Character, Character> map = new HashMap<>();
        int iLen = s.length();
        for (int i = 0; i < iLen; i++) {
            char sChar = s.charAt(i), tChar = t.charAt(i);
            Character sMapChar = map.get(s.charAt(i));
            if (sMapChar != null && sMapChar != tChar) {
                return false;
            }
            if (sMapChar == null) {
                Character tMapChar = map.get(t.charAt(i));
                if (tMapChar != null && tMapChar == tChar) { // a->a, b->a (ab,aa)
                    return false;
                }
                if (map.containsValue(tChar)) { // a->b, b->c, b->d (bar,foo)
                    return false;
                }
            }
            map.put(sChar, tChar);
        }
        return true;
    }
}
