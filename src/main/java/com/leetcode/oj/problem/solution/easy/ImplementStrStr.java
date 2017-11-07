package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/implement-strstr/description/">Implement strStr()</a>
 * <p>
 * Implement <a href="http://www.cplusplus.com/reference/cstring/strstr/">strStr()</a>.
 * <p>
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 * <p>
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * <p>
 * <p>
 * Created by wli on 2017-11-07.
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) return -1;
        int hLen = haystack.length(), nLen = needle.length();
        if (hLen < nLen) return -1;
        if (hLen == nLen) return haystack.equals(needle) ? 0 : -1;

        int idx = -1, loop = hLen - nLen;
        for (int i = 0; i <= loop; i++) {
            if (haystack.substring(i, i + nLen).equals(needle)) {
                idx = i;
                break;
            }
        }
        return idx;
    }
}
