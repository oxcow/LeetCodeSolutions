package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

    @Test
    public void testReverse() throws Exception {
        Assert.assertEquals(-321, ReverseInteger.reverse(-123));
        Assert.assertEquals(0, ReverseInteger.reverse(0));
        Assert.assertEquals(321, ReverseInteger.reverse(123));

    }

    @Test
    public void testReverseBound() throws Exception {
        Assert.assertEquals(0, ReverseInteger.reverse(1000000003));
        Assert.assertEquals(0, ReverseInteger.reverse(2147483647));
        Assert.assertEquals(0, ReverseInteger.reverse(-2147483648));
    }
}