package com.leetcode.oj.problem.solution.easy;

import java.util.BitSet;

/**
 * URL: <a href="https://leetcode.com/problems/hamming-distance/">Hamming Distance</a>
 * <p/>
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * <p/>
 * Given two integers x and y, calculate the Hamming distance.
 * <p/>
 * Note:
 * 0 ≤ x, y < 231.
 * <p/>
 * Example:
 * <p/>
 * Input: x = 1, y = 4
 * <p/>
 * Output: 2
 * <p/>
 * Explanation:
 * 1   (0 0 0 1)
 * <p/>
 * 4   (0 1 0 0)
 * <p/>
 * ↑   ↑
 * <p/>
 * The above arrows point to positions where the corresponding bits are different.
 * <p/>
 * Created by leeyee on 16-12-25.
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int result = x ^ y;
        int count = 0;
        while (result >= 1) {
            count += result & 1;
            result >>= 1;
        }
        return count;
    }

    public int hammingDistanceUseBitSet(int x, int y) {
        if (x == y) return 0;

        BitSet bitSetX = getIntBitSet(x);
        bitSetX.xor(getIntBitSet(y));
        return bitSetX.cardinality();
    }

    private BitSet getIntBitSet(int a) {
        BitSet bitSet = new BitSet();
        int i = 0;
        while (a > 1) {
            int mod = a % 2;
            if (mod == 1) bitSet.set(i);
            a >>= 1;
            ++i;
        }
        if (a == 1) bitSet.set(i);

        return bitSet;
    }
}
