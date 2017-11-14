package com.leetcode.oj.problem.solution.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * URL: <a href="https://leetcode.com/problems/find-all-anagrams-in-a-string/description/">Find All Anagrams in a String</a>
 * <p>
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 * <p>
 * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
 * <p>
 * The order of output does not matter.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * s: "cbaebabacd" p: "abc"
 * <p>
 * Output:
 * [0, 6]
 * <p>
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 * Example 2:
 * <p>
 * Input:
 * s: "abab" p: "ab"
 * <p>
 * Output:
 * [0, 1, 2]
 * <p>
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 * <p>
 * Created by wli on 2017-11-14.
 */
public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indexList = new ArrayList<>();

        if (s == null || p == null || p.isEmpty()) return indexList;

        int sLen = s.length(), pLen = p.length();

        if (pLen > sLen) return indexList;
        if (pLen == sLen && isSimilar(s, p)) {
            indexList.add(0);
            return indexList;
        }

        for (int i = 0; i <= sLen - p.length(); i++) {
            String sub = s.substring(i, i + p.length());
            if (isSimilar(sub, p)) {
                indexList.add(i);
            }
        }
        System.out.println(indexList);
        return indexList;
    }

    private boolean isSimilar(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        char[] chr1 = str1.toCharArray();
        char[] chr2 = str2.toCharArray();
        Arrays.sort(chr1);
        Arrays.sort(chr2);
        return String.valueOf(chr1).equals(String.valueOf(chr2));
    }
}
