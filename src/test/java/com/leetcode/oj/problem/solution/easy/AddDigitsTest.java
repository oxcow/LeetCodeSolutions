package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddDigitsTest {
    private static final Logger logger = LoggerFactory.getLogger(AddDigitsTest.class);

    AddDigits addDigits;

    @Before
    public void init() {
        addDigits = new AddDigits();
    }

    @After
    public void destroy() {
        addDigits = null;
    }

    @Test
    public void testAddDigits() throws Exception {
        Assert.assertEquals(1, addDigits.addDigits(10));
        Assert.assertEquals(2, addDigits.addDigits(11));
        Assert.assertEquals(3, addDigits.addDigits(12));
        Assert.assertEquals(4, addDigits.addDigits(13));
        Assert.assertEquals(5, addDigits.addDigits(14));
        Assert.assertEquals(6, addDigits.addDigits(15));
        Assert.assertEquals(7, addDigits.addDigits(16));
        Assert.assertEquals(1, addDigits.addDigits(19));

        Assert.assertEquals(2, addDigits.addDigits(38));
        Assert.assertEquals(2, addDigits.addDigits(110));
        Assert.assertEquals(6, addDigits.addDigits(123));
        Assert.assertEquals(9, addDigits.addDigits(99));
        Assert.assertEquals(8, addDigits.addDigits(98));
        Assert.assertEquals(9, addDigits.addDigits(999999999));
        Assert.assertEquals(1, addDigits.addDigits(Integer.MAX_VALUE));
    }

    @Test
    public void testAddDigits1() throws Exception {
        Assert.assertEquals(0, addDigits.addDigits1(0));
        Assert.assertEquals(1, addDigits.addDigits1(10));
        Assert.assertEquals(2, addDigits.addDigits1(11));
        Assert.assertEquals(3, addDigits.addDigits1(12));
        Assert.assertEquals(4, addDigits.addDigits1(13));
        Assert.assertEquals(5, addDigits.addDigits1(14));
        Assert.assertEquals(6, addDigits.addDigits1(15));
        Assert.assertEquals(7, addDigits.addDigits1(16));
        Assert.assertEquals(1, addDigits.addDigits1(19));

        Assert.assertEquals(2, addDigits.addDigits1(38));
        Assert.assertEquals(2, addDigits.addDigits1(110));
        Assert.assertEquals(6, addDigits.addDigits1(123));
        Assert.assertEquals(9, addDigits.addDigits1(99));
        Assert.assertEquals(8, addDigits.addDigits1(98));
        Assert.assertEquals(9, addDigits.addDigits1(999999999));
        Assert.assertEquals(1, addDigits.addDigits1(Integer.MAX_VALUE));
    }
}