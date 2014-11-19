package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://oj.leetcode.com/problems/count-and-say/">count-and-say</a>
 * <p/>
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * <p/>
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 * <p/>
 * Note: The sequence of integers will be represented as a string.
 * <p/>
 * Think: 理解题目意思是关键。
 * <p/>
 * 输入int值，输出的是从1开始计算上一个字符串中连续数字的统计次数。比如：
 * <p/>
 * 1 => "1"
 * <p/>
 * 2 => "11" (上一字符串"1"中各个数字字符的统计个数)
 * <p/>
 * 3 => "21" (上一字符串"11"中各个数字字符的统计个数)
 * <p/>
 * 4 => "1211" (上一字符串"21"中各个数字字符的统计个数)
 * <p/>
 * 5 => "111221" (上一字符串"1211"中各个数字字符的统计个数)
 * <p/>
 * Created by leeyee.li on 2014/11/18.
 */
public class CountAndSay {


    public static String countAndSay(int n) {

        if (n <= 0) return "";

        String say = "1";

        for (int i = 0; i < n - 1; i++) {
            say = counts(say);
        }
        return say;
    }

    public static String countAndSay1(int n) {

        if (n <= 0) return "";

        String say = "1";

        for (int i = 0; i < n - 1; i++) {
            say = counts1(say);
        }
        return say;
    }

    public static String counts(String say) {
        String newSay = "";
        char first = say.charAt(0);
        int count = 1;
        for (int i = 1; i < say.length(); ++i) {
            if (first == say.charAt(i)) {
                ++count;
            } else {
                newSay = newSay + count + first;
                first = say.charAt(i);
                count = 1;
            }
        }
        return newSay + count + first;
    }

    public static String counts1(String say) {
        int iLen = say.length();
        String counts = "";
        for (int j = 0; j < iLen; ) {

            char chr = say.charAt(j);

            int count = 0;

            for (int k = j; k < iLen; ++k, j = k) {

                char tChr = say.charAt(k);

                if (tChr == chr) {
                    ++count;
                } else {
                    break;
                }
            }
            counts += count + "" + chr;
        }
        return counts;
    }
}
