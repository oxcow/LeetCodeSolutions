package com.leetcode.oj.problem.solution.easy;

import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * URL: <a href="https://leetcode.com/problems/add-digits/">Add Digits</a>
 * <p/>
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * <p/>
 * For example:
 * <p/>
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * <p/>
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 * <p/>
 * Hint:
 * <ol>
 * <li>A naive implementation of the above process is trivial. Could you come up with other methods?</li>
 * <li>What are all the possible results?</li>
 * <li>How do they occur, periodically or randomly?</li>
 * <li>You may find this <a href="https://en.wikipedia.org/wiki/Digital_root">Wikipedia article</a> useful.</li>
 * </ol>
 * <p/>
 * addDigits 和 addDigits1 在速度上没有太强烈的差异性，唯一不同的只是算法空间上的区别。
 * <p/>
 * Created by leeyee.li on 2015/12/6.
 */
public class AddDigits {
    private static final Logger logger = LoggerFactory.getLogger(AddDigits.class);

    public int addDigits(int num) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        int logA = num;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
            if (num < 10 && num + sum < 10) {
                sum = num + sum;
                break;
            } else {
                num += sum;
                sum = 0;
            }
        }
        logger.debug("Spend: {} nano. addDigits({}) -> {}", stopwatch.stop().elapsed(TimeUnit.NANOSECONDS), logA, sum);
        return sum;
    }

    public int addDigits1(int num) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        int r = 0;
        if (num < 10) {
            r = num;
        } else {
            int mod = num % 9;
            r = mod != 0 ? mod : num == 0 ? 0 : 9;
        }
        logger.debug("Spend: {} nano. addDigits({}) -> {}", stopwatch.stop().elapsed(TimeUnit.NANOSECONDS), num, r);
        return r;
    }
}
