package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/reverse-words-in-a-string-iii">Reverse Words in a String III</a>
 * <p>
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 * <p>
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 * <p>
 * <p>
 * Created by leeyee on 2017/4/30.
 */
public class ReverseWordsInAStringIII {

    public String reverseWords(String s) {
        int sIdx = 0; // need reverse string start index
        int eIdx = 0; // need reverse string end index;
        int iLen = s.length();

        if (iLen < 2) return s;

        char[] chars = s.toCharArray();

        for (int cur = 0; cur < iLen; cur++) {

            // if current char is space or last, do reverse
            if (Character.isSpaceChar(chars[cur]) || cur == iLen - 1) {

                // if current char is space ,end index eq current -1;
                if (Character.isSpaceChar(chars[cur])) {
                    eIdx = cur - 1;
                } else if (cur == iLen - 1) {
                    eIdx = cur;
                }
                // if need reverse substring start index lt end index, reverse substring
                while (sIdx < eIdx) {
                    char tmp = chars[sIdx];
                    chars[sIdx] = chars[eIdx];
                    chars[eIdx] = tmp;
                    ++sIdx;
                    --eIdx;
                }

                sIdx = cur + 1;
            }

        }

        return String.valueOf(chars);
    }
}
