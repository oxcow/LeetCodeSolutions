package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/rotate-string/description/">Rotate String</a>
 * <p>
 * We are given two strings, A and B.
 * <p>
 * A shift on A consists of taking string A and moving the leftmost character to the rightmost position. For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. Return True if and only if A can become B after some number of shifts on A.
 * <p>
 * Example 1:
 * Input: A = 'abcde', B = 'cdeab'
 * Output: true
 * <p>
 * Example 2:
 * Input: A = 'abcde', B = 'abced'
 * Output: false
 * Note:
 * <p>
 * A and B will have length at most 100.
 */
public class RotateString {

    public boolean rotateString(String A, String B) {

        if (A.length() != B.length()) return false;

        char firstChar4B = B.charAt(0);

        for (int i = 0; i < A.length(); i++) {
            if (firstChar4B == A.charAt(i)) {
                if ((A.substring(i, A.length()) + A.substring(0, i)).equals(B)) {
                    return true;
                }
            }
        }

        return false;
    }


    public boolean rotateStringByShortCode(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }
}
