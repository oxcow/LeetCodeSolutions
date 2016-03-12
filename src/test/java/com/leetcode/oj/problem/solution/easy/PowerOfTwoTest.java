package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfTwoTest {

    @Test
    public void testIsPowerOfTwo() throws Exception {
        PowerOfTwo powerOfTwo = new PowerOfTwo();

        Assert.assertFalse(powerOfTwo.isPowerOfTwo(0));

        for (int i = 3; i < 100; i += 2) {
            Assert.assertFalse(powerOfTwo.isPowerOfTwo(i));
        }

        Assert.assertFalse(powerOfTwo.isPowerOfTwo(-16));
        Assert.assertFalse(powerOfTwo.isPowerOfTwo(14));
        Assert.assertFalse(powerOfTwo.isPowerOfTwo(18));
        Assert.assertFalse(powerOfTwo.isPowerOfTwo(20));
        Assert.assertFalse(powerOfTwo.isPowerOfTwo(22));

    }

    @Test
    public void testAllTrue() throws Exception {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        for (int i = 0; i < 31; i++) {
            int power2Num = (int) Math.pow(2, i);
            Assert.assertTrue(powerOfTwo.isPowerOfTwo(power2Num));
        }
    }

    @Test
    public void testIsPowerOfTwoNoLoop() throws Exception {

        PowerOfTwo powerOfTwo = new PowerOfTwo();

        Assert.assertFalse(powerOfTwo.isPowerOfTwoNoLoop(-16));
        Assert.assertFalse(powerOfTwo.isPowerOfTwoNoLoop(0));
        Assert.assertFalse(powerOfTwo.isPowerOfTwoNoLoop(14));
        Assert.assertFalse(powerOfTwo.isPowerOfTwoNoLoop(18));
        Assert.assertFalse(powerOfTwo.isPowerOfTwoNoLoop(20));
        Assert.assertFalse(powerOfTwo.isPowerOfTwoNoLoop(22));

        for (int i = 3; i < 100; i += 2) {
            Assert.assertFalse(powerOfTwo.isPowerOfTwoNoLoop(i));
        }

        for (int i = 0; i < 31; i++) {
            int power2Num = (int) Math.pow(2, i);
            Assert.assertTrue(powerOfTwo.isPowerOfTwoNoLoop(power2Num));
        }
    }

}