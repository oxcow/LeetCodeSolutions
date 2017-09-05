package com.leetcode.oj.problem.solution.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * URL: <a href="https://leetcode.com/problems/happy-number/description/">Happy Number</a>
 * <p>
 * Write an algorithm to determine if a number is "happy".
 * <p>
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 * <p>
 * Example: 19 is a happy number
 * <p>
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * <p>
 * Created by leeyee on 2017/9/5 21:03.
 */
public class HappyNumber {
    public static final Logger logger = LoggerFactory.getLogger(HappyNumber.class);

    public boolean isHappy(int n) {
        int sum = 0;
        boolean isHappy = false;
        int print = n;
        StringBuilder sb = new StringBuilder();
        while (true) {
            while (n != 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            sb.append(sum + ",");

            // 4 is magic number, you can find the detail explanation from following link:
            // https://discuss.leetcode.com/topic/42746/all-you-need-to-know-about-testing-happy-number
            // before solving this problem, I don't know this algorithm. I found this magic number through the test.
            if (sum > 4) {
                n = sum;
                sum = 0;
            } else {
                isHappy = sum == 1 ? true : false;
                break;
            }
        }
        logger.info("{} is happy number? {}. [{}]", print, isHappy, sb.delete(sb.length() - 1, sb.length()).toString());
        return isHappy;
    }
}
