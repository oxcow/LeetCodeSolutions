package com.leetcode.oj.problem.solution.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * URL: <a href="https://leetcode.com/problems/consecutive-numbers-sum/description/">Consecutive Numbers Sum</a>
 * <p>
 * Given a positive integer N, how many ways can we write it as a sum of consecutive positive integers?
 * <p>
 * Example 1:
 * <p>
 * Input: 5
 * Output: 2
 * Explanation: 5 = 5 = 2 + 3
 * Example 2:
 * <p>
 * Input: 9
 * Output: 3
 * Explanation: 9 = 9 = 4 + 5 = 2 + 3 + 4
 * Example 3:
 * <p>
 * Input: 15
 * Output: 4
 * Explanation: 15 = 15 = 8 + 7 = 4 + 5 + 6 = 1 + 2 + 3 + 4 + 5
 * Note: 1 <= N <= 10 ^ 9.
 */
public class ConsecutiveNumbersSum {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsecutiveNumbersSum.class);

    /**
     * 1 => S => 1S
     * 2 => S + S + 1 => 2S + 1
     * 3 => S + S + 1 + S + 2 => 3S + 3
     * 4 => S + S + 1 + S + 2 + S + 3 => 4S + 6
     * N => S + S + 1 + ... + S + ( L - 1) => L*S + ( L( L - 1 ) ) / 2
     * <p>
     * N = L * S + L * ( L - 1 ) / 2
     * S = ( N - L * ( L - 1 ) / 2 ) / L
     * <p>
     * N：目标数
     * L: 连续数个数
     * S：连续数起始数
     *
     * @param N
     * @return
     */
    public int consecutiveNumbersSum(int N) {

        StringBuilder logSb = new StringBuilder();
        logSb.append(N).append(" = ").append(N);

        int L = 2, total = 1;

        while (L * (L - 1) / 2 < N) {

            if ((N - L * (L - 1) / 2) % L == 0) {
                ++total;

                if (LOGGER.isDebugEnabled()) {
                    int S = (N - L * (L - 1) / 2) / L;
                    logSb.append(" = ").append(S);
                    for (int i = 1; i < L; i++) {
                        logSb.append(" + ").append(++S);
                    }
                }
            }
            ++L;
        }

        LOGGER.debug("{} Consecutive Numbers Sum is {}", N, total);
        LOGGER.debug(logSb.toString());

        return total;
    }
}


