package com.leetcode.oj.problem.solution.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * URL: <a href="https://oj.leetcode.com/problems/largest-number/">Largest Number</a>
 * <p/>
 * Given a list of non negative integers, arrange them such that they form the largest number.
 * <p/>
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * <p/>
 * Note: The result may be very large, so you need to return a string instead of an integer.
 * <p/>
 * Created by leeyee.li on 2015/2/20.
 */
public class LargestNumber {
    private static final Logger logger = LoggerFactory.getLogger(LargestNumber.class);

    public String largestNumber(int[] num) {
        if (num == null || num.length == 0) return "";
        logger.debug("base num={}", num);
        // 冒泡排序，每次将最大的移动第一个位置
        for (int i = 0; i < num.length; i++) {
            int maxNum = num[i];
            for (int j = i + 1; j < num.length; j++) {
                int nextNum = num[j];
                String tryGroup1 = maxNum + "" + nextNum;
                String tryGroup2 = nextNum + "" + maxNum;
                if (tryGroup2.compareTo(tryGroup1) > 0) {
                    num[i] = nextNum;
                    num[j] = maxNum;
                    maxNum = nextNum;
                }
            }
        }
        logger.debug("sort desc num={}", num);
        StringBuilder largestNumber = new StringBuilder();
        if (num[0] == 0) { // if first element eq 0 by sort desc, so all element eq 0
            largestNumber.append(0);
        } else {
            for (int i = 0; i < num.length; i++) {
                largestNumber.append(num[i]);
            }
        }
        logger.debug("largestNumber={}", largestNumber.toString());
        return largestNumber.toString();
    }
}
