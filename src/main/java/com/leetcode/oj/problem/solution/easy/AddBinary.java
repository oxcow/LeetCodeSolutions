package com.leetcode.oj.problem.solution.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * URL: <a href="https://oj.leetcode.com/problems/add-binary/">Add Binary</a>
 * <p/>
 * About adder's algorithm,you can see <a href="http://en.wikipedia.org/wiki/Adder_%28electronics%29">Adder (electronics)</a> wiki.
 * <p/>
 * It's core is:
 * <pre>
 *      S = A ^ B ^ C
 *      C =( A ^ B) & ( C | ( A & B) )
 * </pre>
 * <p/>
 * Given two binary strings, return their sum (also a binary string).
 * <p/>
 * For example,
 * <pre>
 * a = "11"
 * b = "1"
 * </pre>
 * Return "100".
 * <p/>
 * Created by leeyee.li on 2015/2/22.
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        int iALen = a.length();
        int iBLen = b.length();
        int iMaxLen = Math.max(iALen, iBLen);
        String result = "";
        int carry = 0; // 进位符
        for (int i = 0; i < iMaxLen; i++) {
            int aChr = iALen - i - 1 < 0 ? 0 : a.charAt(iALen - i - 1) - 48;
            int bChr = iBLen - i - 1 < 0 ? 0 : b.charAt(iBLen - i - 1) - 48;
            int xor = aChr ^ bChr ^ carry;
            result = xor + result;
            carry = ((aChr ^ bChr) & carry) | (aChr & bChr); // aChr,bChr,carry有最少两个为1时，进位符carry=1
        }
        return carry == 0 ? result : carry + result;
    }
}
