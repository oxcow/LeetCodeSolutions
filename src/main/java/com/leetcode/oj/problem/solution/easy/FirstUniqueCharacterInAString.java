package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/first-unique-character-in-a-string/description/">First Unique Character in a String</a>
 * <p>
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * <p>
 * Examples:
 * <p>
 * s = "leetcode"
 * return 0.
 * <p>
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */
public class FirstUniqueCharacterInAString {

    public static final char MAGIC_CHAR = '#';

    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) return -1;
        char[] chars = s.toCharArray();
        int firstUniqIndex = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == MAGIC_CHAR) continue;
            boolean isUniq = true;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    if (isUniq) isUniq = false;
                    chars[j] = MAGIC_CHAR;
                }
            }
            if (isUniq) {
                firstUniqIndex = i;
                break;
            }
        }
        return firstUniqIndex;
    }

}
