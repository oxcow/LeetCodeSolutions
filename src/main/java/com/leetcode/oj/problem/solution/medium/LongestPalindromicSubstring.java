package com.leetcode.oj.problem.solution.medium;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * URL: <a href="https://leetcode.com/problems/longest-palindromic-substring/description/">Longest Palindromic Substring</a>
 * <p>
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * <p>
 * Example:
 * <p>
 * Input: "babad"
 * <p>
 * Output: "bab"
 * <p>
 * Note: "aba" is also a valid answer.
 * Example:
 * <p>
 * Input: "cbbd"
 * <p>
 * Output: "bb"
 * <p>
 * Created by wli on 2017-08-08.
 */
public class LongestPalindromicSubstring {

    private boolean isPalindrome(String s) {
        boolean isPal = true;
        for (int p = 0, n = s.length() - 1; p < s.length() / 2; p++) {
            if (s.charAt(p) != s.charAt(n)) {
                isPal = false;
                break;
            } else {
                --n;
            }
        }
        return isPal;
    }

    public String longestPalindrome(String s) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        if (s == null || isPalindrome(s)) return s;
        Set<String> maybePalindromicStrings = new HashSet<>();
        String maybePalindromicString = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                maybePalindromicString += s.charAt(j);
                if (maybePalindromicString.charAt(0) == s.charAt(j)) {
                    maybePalindromicStrings.add(maybePalindromicString);
                }
            }
            if (i + 2 < s.length()) {
                maybePalindromicString = s.substring(i + 1, i + 2);
            }
        }
        String longestPal = s.substring(0, 1);
        for (String maybe : maybePalindromicStrings) {
            if (isPalindrome(maybe) && maybe.length() > longestPal.length()) {
                longestPal = maybe;
            }
        }
        System.out.println("P1 count string size: " + s.length() + " spend: " + stopwatch.stop().elapsed(TimeUnit.MILLISECONDS) + "ms");
        return longestPal;
    }


    public String longestPalindrome2(String s) {
        Stopwatch stopwatch = Stopwatch.createStarted();

        if (s == null || isPalindrome(s)) return s;

        Set<String> maybePalindromicStrings = new HashSet<>();

        for (int i = 0, j = 1; i < s.length() - 1; ) {
            if (s.charAt(i) == s.charAt(j)) {
                maybePalindromicStrings.add(s.substring(i, j + 1));
            }
            j = j < s.length() - 1 ? ++j : ++i + 1;
        }

        String longestPal = s.substring(0, 1);
        for (String maybe : maybePalindromicStrings) {
            if (isPalindrome(maybe) && maybe.length() > longestPal.length()) {
                longestPal = maybe;
            }
        }
        System.out.println("P2 count string size: " + s.length() + " spend: " + stopwatch.stop().elapsed(TimeUnit.MILLISECONDS) + "ms");
        return longestPal;
    }
}
