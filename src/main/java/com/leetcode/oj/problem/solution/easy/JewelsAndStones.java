package com.leetcode.oj.problem.solution.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.BitSet;

/**
 * Created by wli on 2018-01-30.
 */
public class JewelsAndStones {

    public static final Logger logger = LoggerFactory.getLogger(AddDigits.class);

    /**
     * normal method.
     * <p>
     * Time complexity: O(n2). (J.length * S.length)
     * <p>
     * Space complexity: O(1).
     *
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (char j : J.toCharArray()) {
            for (char s : S.toCharArray()) {
                if (j == s) {
                    ++count;
                }
            }
        }
        return count;
    }

    /**
     * 1.首先将J存入BitSet中，用来标记我们已有的宝石类型。
     * 2.遍历宝石，如果宝石类型在BitSet中，则进行计数。
     * <p>
     * Time complexity: O(n). n = S.length
     * <p>
     * Space complexity: O(n). n = J.length
     *
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStonesByMap(String J, String S) {
        int count = 0;
        BitSet bitSet = new BitSet(J.length());
        for (char j : J.toCharArray()) {
            bitSet.set(j);
        }

        for (char s : S.toCharArray()) {
            if (bitSet.get(s)) ++count;
        }
        return count;
    }
}
