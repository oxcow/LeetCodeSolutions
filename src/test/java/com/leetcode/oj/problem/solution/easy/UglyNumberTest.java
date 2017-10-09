package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leeyee on 2017/9/9.
 */
public class UglyNumberTest {

    @Test
    public void isUgly() throws Exception {
        UglyNumber solution = new UglyNumber();
        Assert.assertTrue(solution.isUgly(6));
        Assert.assertTrue(solution.isUgly(8));
        Assert.assertFalse(solution.isUgly(7));
        Assert.assertFalse(solution.isUgly(14));
        Assert.assertFalse(solution.isUgly(234));
        Assert.assertFalse(solution.isUgly(Integer.MAX_VALUE));

    }

}