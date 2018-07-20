package com.leetcode.oj.problem.solution.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * URL: <a href="https://leetcode.com/problems/rotated-digits/description/">Rotated Digits</a>
 * <p>
 * X is a good number if after rotating each digit individually by 180 degrees, we get a valid number that is different from X.  Each digit must be rotated - we cannot choose to leave it alone.
 * <p>
 * A number is valid if each digit remains a digit after rotation. 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other; 6 and 9 rotate to each other, and the rest of the numbers do not rotate to any other number and become invalid.
 * <p>
 * Now given a positive number N, how many numbers X from 1 to N are good?
 * <p>
 * Example:
 * Input: 10
 * Output: 4
 * Explanation:
 * There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
 * Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.
 * Note:
 * <p>
 * N  will be in range [1, 10000].
 */
public class RotatedDigits {

    private static final Logger LOGGER = LoggerFactory.getLogger(RotatedDigits.class);

    // 3,4,7 无效 -1
    // 2,5,6,9 可旋转成不同数字 1
    // 0,1,8 旋转成自身 0
    private static final int[] ROTATE_FACTOR = new int[]{0, 0, 1, -1, -1, 1, 1, -1, 0, 1};

    public int rotatedDigits(int N) {

        List<Integer> goodNumbers = new ArrayList<>();

        int allGoodNum = 0;

        for (int i = 1; i <= N; i++) {
            int n = i;
            boolean isGoodNum = false;
            while (n > 0) {
                if (ROTATE_FACTOR[n % 10] == -1) {
                    isGoodNum = false;
                    break;
                }
                if (ROTATE_FACTOR[n % 10] == 1) {
                    isGoodNum = true;
                }
                n = n / 10;
            }
            if (isGoodNum) {
                ++allGoodNum;
                if (LOGGER.isDebugEnabled()) {
                    goodNumbers.add(i);
                }
            }
        }

        LOGGER.debug("Total {} good numbers from 1 to {}. They are {}", allGoodNum, N, goodNumbers);

        return allGoodNum;
    }
}

