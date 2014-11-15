package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://oj.leetcode.com/problems/valid-palindrome/">valid-palindrome</a>
 * <p/>
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p/>
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * <p/>
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 * <p/>
 * For the purpose of this problem, we define empty string as valid palindrome.
 * <p/>
 * Created by leeyee.li on 2014/11/14.
 */
public class ValidPalindrome {
    public static boolean isLetterOrDigit(char chr) {
        //return (chr >= 48 && chr <= 57) || (chr >= 97 && chr <= 122) || (chr >= 65 && chr <= 90);
        return (chr >= '0' && chr <= '9') || (chr >= 'a' && chr <= 'z') || (chr >= 'A' && chr <= 'Z');
    }

    public static boolean isPalindrome(String str) {

        if (str == null) return false;

        str = str.trim();

        if ("".equals(str) || str.length() == 1) return true;

        boolean result = true;

        char[] chars = str.toCharArray();

        int iLen = chars.length;

        for (int head = 0, tail = iLen - 1; head < tail; ) {

            char headChar = chars[head];
            char tailChar = chars[tail];

            if (isLetterOrDigit(headChar)) {

                if (isLetterOrDigit(tailChar)) {

                    if (headChar == tailChar || headChar - tailChar == 32 || headChar - tailChar == -32) {
                        --tail;
                        ++head;
                    } else {
                        result = false;
                        break;
                    }

                } else {
                    --tail;
                }
            } else {
                ++head;
            }
            /*if ((headChar >= 48 && headChar <= 57)
                    || (headChar >= 97 && headChar <= 122)
                    || (headChar >= 65 && headChar <= 90)) { // 0-9 a-z A-Z

                if ((tailChar >= 48 && tailChar <= 57)
                        || (tailChar >= 65 && tailChar <= 90)
                        || (tailChar >= 97 && tailChar <= 122)) {

                    if (headChar == tailChar || headChar - tailChar == 32 || headChar - tailChar == -32) {
                        --tail;
                        ++head;
                    } else {
                        r = false;
                        break;
                    }
                } else {
                    --tail;
                }
            } else {
                ++head;
            }*/
        }
        return result;
    }
}
