package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/reverse-vowels-of-a-string/discuss/">Reverse Vowels of a String</a>
 * <p>
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * <p>
 * Example 1:
 * Given s = "hello", return "holle".
 * <p>
 * Example 2:
 * Given s = "leetcode", return "leotcede".
 * <p>
 * Note:
 * The vowels does not include the letter "y".
 * <p>
 * Created by wli on 2017-08-31.
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 1) return s;
        int len = s.length();
        char chars[] = s.toCharArray();
        for (int i = 0, j = len - 1; i < len && i < j; ) {
            boolean headIsVowel = isVowel(chars[i]);
            boolean tailIsVowel = isVowel(chars[j]);
            if (headIsVowel && tailIsVowel) {
                char tmp = chars[i];
                chars[i++] = chars[j];
                chars[j--] = tmp;
            } else if (headIsVowel) {
                --j;
            } else if (tailIsVowel) {
                ++i;
            } else {
                ++i;
                --j;
            }
        }
        return String.valueOf(chars);
    }

    public static boolean isVowel(char c) {
        c = Character.toUpperCase(c);
        boolean isVowel = false;
        switch (c) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isVowel = true;
                break;
        }
        return isVowel;
    }
}
