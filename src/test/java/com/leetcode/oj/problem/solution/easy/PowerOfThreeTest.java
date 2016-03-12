package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class PowerOfThreeTest {
    private Logger logger = LoggerFactory.getLogger(PowerOfThreeTest.class);

    @Test
    public void testIsPowerOfThree() throws Exception {
        PowerOfThree powerOfThree = new PowerOfThree();

        Assert.assertFalse(powerOfThree.isPowerOfThree(0));
        Assert.assertFalse(powerOfThree.isPowerOfThree(12));
        Assert.assertFalse(powerOfThree.isPowerOfThree(15));
        Assert.assertFalse(powerOfThree.isPowerOfThree(18));
        Assert.assertFalse(powerOfThree.isPowerOfThree(21));

    }

    @Test
    public void testAllOdd() throws Exception {
        PowerOfThree powerOfThree = new PowerOfThree();

        for (int odd = 0; odd < Integer.MAX_VALUE; odd += 2) {
            boolean isFalse = powerOfThree.isPowerOfThree(odd);
            Assert.assertFalse(isFalse);
            logger.info("{} is power of three? {}", odd, isFalse);
        }

    }

    @Test
    public void testAllPowerOfThree() throws Exception {

        PowerOfThree powerOfThree = new PowerOfThree();

        for (int i = 0; i < 20; i++) {
            int power3Num = (int) Math.pow(3, i);
            boolean isTrue = powerOfThree.isPowerOfThree(power3Num);
            Assert.assertTrue(isTrue);
            logger.info("{} is power of three? {}", power3Num, isTrue);
        }
    }

    @Test
    public void testIsPowOfThreeNoLoop()throws Exception{

        PowerOfThree powerOfThree = new PowerOfThree();

        Assert.assertFalse(powerOfThree.isPowerOfThreeNoLoop(0));
        Assert.assertFalse(powerOfThree.isPowerOfThreeNoLoop(12));
        Assert.assertFalse(powerOfThree.isPowerOfThreeNoLoop(15));
        Assert.assertFalse(powerOfThree.isPowerOfThreeNoLoop(18));
        Assert.assertFalse(powerOfThree.isPowerOfThreeNoLoop(21));

        for (int i = 0; i < 19; i++) {
            int power3Num = (int) Math.pow(3, i);
            boolean isTrue = powerOfThree.isPowerOfThreeNoLoop(power3Num);
            Assert.assertTrue(isTrue);
            logger.info("{} is power of three? {}", power3Num, isTrue);
        }

        for (int odd = 0; odd < 1000; odd += 2) {
            boolean isFalse = powerOfThree.isPowerOfThreeNoLoop(odd);
            Assert.assertFalse(isFalse);
            logger.info("{} is power of three? {}", odd, isFalse);
        }
    }
}