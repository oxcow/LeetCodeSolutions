package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/reverse-string-ii/description/">Reverse String II</a>
 * <p>
 * Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
 * Example:
 * Input: s = "abcdefg", k = 2
 * Output: "bacdfeg"
 * Restrictions:
 * The string consists of lower English letters only.
 * Length of the given string and k will in the range [1, 10000]
 * <p>
 * Created by wli on 2018-02-12.
 */
public class ReverseStringII {

    public String reverseStr(String s, int k) {

        int iLen = s.length();

        k = Math.min(k, iLen); // 如果 k 大于字符串长度,则k取当前字符串长度

        char[] chars = s.toCharArray();

        int segment = 0, head = 0, tail = k - 1;
        while (head < iLen) {
            char tmp = chars[head];
            chars[head] = chars[tail];
            chars[tail] = tmp;
            ++head;
            --tail;
            if (head > tail) { // 当前段反转完成，开始计算下一段起始
                ++segment;
                head = segment * 2 * k;
                tail = Math.min(head + k - 1, iLen - 1);
            }
        }
        return String.valueOf(chars);
    }
}
