package com.leetcode.oj.problem.solution.easy;

import java.math.BigInteger;

/**
 * URL: <a href="https://leetcode.com/problems/number-of-1-bits/">Number of 1 Bits</a>
 * <p>
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the <a href="https://en.wikipedia.org/wiki/Hamming_weight">Hamming weight</a>).
 * <p>
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 * <p>
 * Created by leeyee on 16-3-5.
 */
public class NumberOf1Bits {

    public int hammingWeight(int n) {

        int iBits = 0;

        if (n >= 0) {
            while (n >= 1) {
                iBits += n & 1;
                n >>= 1;
            }
        } else {

            String binaryStr = Integer.toBinaryString(n);

            for (char c : binaryStr.toCharArray()) {
                if (c == '1') {
                    ++iBits;
                }
            }

        }

        return iBits;
    }
}
