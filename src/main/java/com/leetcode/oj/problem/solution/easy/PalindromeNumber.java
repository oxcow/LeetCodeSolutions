package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://oj.leetcode.com/problems/palindrome-number/">palindrome-number</a>
 * <p/>
 * Determine whether an integer is a palindrome. Do this without extra space.
 * <p/>
 * Some hints:
 * Could negative integers be palindromes? (ie, -1)
 * <p/>
 * If you are thinking of converting the integer to string, note the restriction of using extra space.
 * <p/>
 * You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?
 * <p/>
 * There is a more generic way of solving this problem.
 * <p/>
 * Created by leeyee.li on 2014/11/14.
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        boolean r = true;
        char[] sx = (x + "").toCharArray();
        int iLen = sx.length;
        for (int i = 0; i < iLen / 2; i++) {
            char h = sx[i];
            char t = sx[iLen - i - 1];
            if (h != t) {
                r = false;
                break;
            }
        }
        return r;
    }
}
