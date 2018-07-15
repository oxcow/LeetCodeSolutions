package com.leetcode.oj.problem.solution.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * URL: <a href="https://leetcode.com/problems/binary-number-with-alternating-bits/description/">Binary Number with Alternating Bits</a>
 * <p>
 * Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.
 * <p>
 * Example 1:
 * Input: 5
 * Output: True
 * Explanation:
 * The binary representation of 5 is: 101
 * Example 2:
 * Input: 7
 * Output: False
 * Explanation:
 * The binary representation of 7 is: 111.
 * Example 3:
 * Input: 11
 * Output: False
 * Explanation:
 * The binary representation of 11 is: 1011.
 * Example 4:
 * Input: 10
 * Output: True
 * Explanation:
 * The binary representation of 10 is: 1010.
 */
public class BinaryNumberWithAlternatingBits {

    private static final Logger logger = LoggerFactory.getLogger(BinaryNumberWithAlternatingBits.class);

    public boolean hasAlternatingBits(int n) {

        String binaryString = Integer.toBinaryString(n);

        char[] binChars = binaryString.toCharArray();

        int len = binChars.length;

        if (len == 1) return true;
        if (len == 2) return binChars[0] != binChars[1];

        int loop4Log = 0;

        boolean isAlter = true;

        // the worst is O(len)
        for (int i = 0; i < len - 1; i++) {
            loop4Log++;
            if (binChars[i] == binChars[i + 1]) {
                isAlter = false;
                break;
            }
        }

        logger.debug("input {} to binary is {}. hasAlternatingBits: {}, one-way loops: {}",
                n, binaryString, isAlter, loop4Log);
        return isAlter;
    }


    public boolean hasAlternatingBitsByTwoWayLoop(int n) {
        String binaryString = Integer.toBinaryString(n);

        char[] binChars = binaryString.toCharArray();

        int len = binChars.length;

        if (len == 1) return true;
        if (len == 2) return binChars[0] != binChars[1];

        int loop4Log = 0;

        boolean isAlter = true;

        // the worst is O(len/2)
        for (int head = 0, tail = len - 1; head < tail; head++, tail--) {
            loop4Log++;
            if (binChars[head] == binChars[head + 1] || binChars[tail] == binChars[tail - 1]) {
                isAlter = false;
                break;
            }
        }
        logger.debug("input {} to binary is {}. hasAlternatingBits: {}, two-way loops: {}",
                n, binaryString, isAlter, loop4Log);
        return isAlter;
    }
}
