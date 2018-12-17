package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leeyee on 2017/5/13.
 */
public class SumOfTwoIntegersTest {
    @Test
    public void getSum() throws Exception {
        SumOfTwoIntegers sumOfTwoIntegers = new SumOfTwoIntegers();
        Assert.assertEquals(0, sumOfTwoIntegers.getSum(-1, 1));
        Assert.assertEquals(3, sumOfTwoIntegers.getSum(1, 2));
        Assert.assertEquals(1, sumOfTwoIntegers.getSum(1, 0));
        Assert.assertEquals(10, sumOfTwoIntegers.getSum(3, 7));
        Assert.assertEquals(-2, sumOfTwoIntegers.getSum(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }
}