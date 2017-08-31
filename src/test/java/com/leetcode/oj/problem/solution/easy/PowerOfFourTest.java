package com.leetcode.oj.problem.solution.easy;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wli on 2017-08-31.
 */
public class PowerOfFourTest {
    PowerOfFour pof = null;

    @Before
    public void setUp() throws Exception {
        pof = new PowerOfFour();
    }

    @After
    public void tearDown() throws Exception {
        pof = null;
    }

    @Test
    public void isPowerOfFour() throws Exception {
        Assert.assertFalse(pof.isPowerOfFour(0));
        Assert.assertTrue(pof.isPowerOfFour(4));
        Assert.assertFalse(pof.isPowerOfFour(3));
        Assert.assertTrue(pof.isPowerOfFour(16));
        Assert.assertFalse(pof.isPowerOfFour(101));
    }

    @Test
    public void isPowerOfFourNoLoop() throws Exception {
        Assert.assertFalse(pof.isPowerOfFourNoLoop(0));
        Assert.assertTrue(pof.isPowerOfFourNoLoop(4));
        Assert.assertFalse(pof.isPowerOfFourNoLoop(3));
        Assert.assertTrue(pof.isPowerOfFourNoLoop(16));
        Assert.assertFalse(pof.isPowerOfFourNoLoop(101));
    }

    @Test
    public void isPowerOfFourTrue() throws Exception {
        for (int i = 0; i < 10; i++) {
            Assert.assertTrue(pof.isPowerOfFourNoLoop((int) Math.pow(4, 10)));
        }
    }
}