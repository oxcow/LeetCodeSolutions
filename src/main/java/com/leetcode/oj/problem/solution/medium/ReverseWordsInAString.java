package com.leetcode.oj.problem.solution.medium;

/**
 * URL: <a href="https://oj.leetcode.com/problems/reverse-words-in-a-string/">reverse-words-in-a-string</a>
 * <p/>
 * Given an input string, reverse the string word by word.
 * <p/>
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 * <p/>
 * click to show clarification.
 * <p/>
 * Clarification:
 * What constitutes a word?
 * A sequence of non-space characters constitutes a word.
 * Could the input string contain leading or trailing spaces?
 * Yes. However, your reversed string should not contain leading or trailing spaces.
 * How about multiple spaces between two words?
 * Reduce them to a single space in the reversed string.
 * <p/>
 * <p/>
 * Think:
 * 之前已经完成了转置字符串内非空格字符串。但由于理解错了题目关于字符串两端包含空格的处理要求，导致花费较多的时间去处理原字符串前后空格原样输出的情况。
 * <p/>
 * Created by leeyee.li on 2014/11/15.
 */
public class ReverseWordsInAString {

    public static String reverseWords(String str) {

        if (str == null) return null;

        int iLen = str.length();

        String revStr = "";
        String word = "";

        for (int i = 0; i < iLen; ++i) {
            char chr = str.charAt(i);
            if (Character.isSpaceChar(chr)) {//空格
                if (!"".equals(word)) {//连续字符不为空，则重组输出顺序
                    revStr = !"".equals(revStr) ? word + chr + revStr : word; // 只有一个字符串时，不需要添加额外的空格进行分割
                    word = "";
                }
            } else {
                word += chr; // 获取连续字符
            }
        }

        if (!"".equals(word)) { // 处理字符串右边不包含空格的情况。循环结束后，word肯定不为空串
            revStr = !"".equals(revStr) ? word + " " + revStr : word;
        }

        return revStr;
    }

    /**
     * 对字符串前后空格不做处理，按原格式返回
     *
     * @param str
     * @return
     */
    public static String reverseWords1(String str) {

        if (str == null) return null;

        int iLen = str.length();

        String revStr = "";
        String word = "";

        int leadCharIndex = 0;//非空格空最左边位置
        int tailCharIndex = iLen;//非空格最右边位置

        for (int i = 0; i < iLen; ++i) {
            char chr = str.charAt(i);
            if (Character.isSpaceChar(chr)) {
                if (!"".equals(word)) {
                    revStr = !"".equals(revStr) ? word + chr + revStr : word;
                    word = "";
                }
                if ("".equals(revStr)) {
                    leadCharIndex = i + 1;
                }
            } else {
                word += chr;
                tailCharIndex = i + 1;
            }
        }

        if (!"".equals(word)) {
            revStr = !"".equals(revStr) ? word + " " + revStr : word;
        }
        // if(leadCharIndex != tailCharIndex)
        revStr = str.substring(0, leadCharIndex) + revStr + str.substring(tailCharIndex, iLen); //原字符串左右空格原样输出

        return revStr;
    }
}
