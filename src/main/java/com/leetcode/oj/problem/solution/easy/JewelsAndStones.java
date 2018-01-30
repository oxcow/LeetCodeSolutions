package com.leetcode.oj.problem.solution.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.BitSet;

/**
 * URL: <a href="https://leetcode.com/problems/jewels-and-stones/description/">Jewels and Stones</a>
 * <p>
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * <p>
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * <p>
 * Example 1:
 * <p>
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * Example 2:
 * <p>
 * Input: J = "z", S = "ZZ"
 * Output: 0
 * Note:
 * <p>
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 * <p>
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
