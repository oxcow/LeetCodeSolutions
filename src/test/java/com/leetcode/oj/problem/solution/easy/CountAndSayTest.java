package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.Test;

public class CountAndSayTest {

    @Test
    public void testCountAndSay() throws Exception {
        Assert.assertEquals("", CountAndSay.countAndSay(0));
        Assert.assertEquals("1", CountAndSay.countAndSay(1));
        Assert.assertEquals("11", CountAndSay.countAndSay(2));
        Assert.assertEquals("21", CountAndSay.countAndSay(3));
        Assert.assertEquals("1211", CountAndSay.countAndSay(4));
        Assert.assertEquals("111221", CountAndSay.countAndSay(5));
        Assert.assertEquals("312211", CountAndSay.countAndSay(6));
        Assert.assertEquals("13112221", CountAndSay.countAndSay(7));
        Assert.assertEquals("1113213211", CountAndSay.countAndSay(8));
        Assert.assertEquals("31131211131221", CountAndSay.countAndSay(9));
        Assert.assertEquals("13211311123113112211", CountAndSay.countAndSay(10));
    }


    @Test
    public void testCountAndSay1() throws Exception {
        Assert.assertEquals("", CountAndSay.countAndSay1(0));
        Assert.assertEquals("1", CountAndSay.countAndSay1(1));
        Assert.assertEquals("11", CountAndSay.countAndSay1(2));
        Assert.assertEquals("21", CountAndSay.countAndSay1(3));
        Assert.assertEquals("1211", CountAndSay.countAndSay1(4));
        Assert.assertEquals("111221", CountAndSay.countAndSay1(5));
        Assert.assertEquals("312211", CountAndSay.countAndSay1(6));
        Assert.assertEquals("13112221", CountAndSay.countAndSay1(7));
        Assert.assertEquals("1113213211", CountAndSay.countAndSay1(8));
        Assert.assertEquals("31131211131221", CountAndSay.countAndSay1(9));
        Assert.assertEquals("13211311123113112211", CountAndSay.countAndSay1(10));
    }
}