package com.leetcode.oj.problem.solution.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * URL: <a href="https://leetcode.com/problems/word-pattern/description/">Word Pattern</a>
 * <p>
 * Given a pattern and a string str, find if str follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 * <p>
 * Example 1:
 * <p>
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: true
 * Example 2:
 * <p>
 * Input:pattern = "abba", str = "dog cat cat fish"
 * Output: false
 * Example 3:
 * <p>
 * Input: pattern = "aaaa", str = "dog cat cat dog"
 * Output: false
 * Example 4:
 * <p>
 * Input: pattern = "abba", str = "dog dog dog dog"
 * Output: false
 * <p>
 * Notes:
 * You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {

        String[] strs = str.split(" ");

        if (pattern.length() != strs.length) return false;

        Map<Character, String> map = new HashMap<>();

        char[] patterChars = pattern.toCharArray();

        for (int i = 0; i < strs.length; i++) {
            if (map.containsKey(patterChars[i])
                    && !map.get(patterChars[i]).equals(strs[i])) {
                return false;
            }

            if (!map.containsKey(patterChars[i]) && map.containsValue(strs[i])) {
                return false;
            }

            map.putIfAbsent(patterChars[i], strs[i]);
        }

        return true;
    }
}
