package com.leetcode.oj.problem.solution.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * URL: <a href="https://leetcode.com/problems/integer-replacement/description/">Integer Replacement</a>
 * <p>
 * Given a positive integer n and you can do operations as follow:
 * <p>
 * If n is even, replace n with n/2.
 * If n is odd, you can replace n with either n + 1 or n - 1.
 * What is the minimum number of replacements needed for n to become 1?
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 8
 * <p>
 * Output:
 * 3
 * <p>
 * Explanation:
 * 8 -> 4 -> 2 -> 1
 * Example 2:
 * <p>
 * Input:
 * 7
 * <p>
 * Output:
 * 4
 * <p>
 * Explanation:
 * 7 -> 8 -> 4 -> 2 -> 1
 * or
 * 7 -> 6 -> 3 -> 2 -> 1
 */
public class IntegerReplacement {

    private static final Logger logger = LoggerFactory.getLogger(IntegerReplacement.class);

    public int integerReplacement(int nm) {
        int step = 0, loop4Log = 0;
        Long n = Long.valueOf(nm);
        StringBuilder logSb = new StringBuilder("" + nm);

        while (n != 1) {
            loop4Log++;

            // 处理偶数
            if (n % 2 == 0) {
                step++;
                n = n >> 1;
                logSb.append(" -> ").append(n);
                continue;
            }

            // 处理奇数

            long reduceOne2Even = n - 1;
            if (reduceOne2Even == 2) {
                step += 2;
                logSb.append(" -> ").append(reduceOne2Even).append(" -> ").append(1);
                break;
            }

            long plusOne2Even = n + 1;
            long halfPlusOne2Even = plusOne2Even >> 1;
            long halfReduceOne2Even = reduceOne2Even >> 1;

            if (halfReduceOne2Even % 2 == 0) {
                step += 2;
                logSb.append(" -> ").append(reduceOne2Even).append(" -> ").append(halfReduceOne2Even);
                n = halfReduceOne2Even;
                continue;
            }

            step += 2;
            logSb.append(" -> ").append(plusOne2Even).append(" -> ").append(halfPlusOne2Even);
            n = halfPlusOne2Even;
        }
        logger.debug("{} loops, {} Steps. {}", loop4Log, step, logSb.toString());
        return step;
    }
}
