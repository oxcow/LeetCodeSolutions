package com.leetcode.oj.problem.solution.easy;

import com.google.common.base.Stopwatch;
import junit.framework.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class NumberOf1BitsTest {
    private Logger logger = LoggerFactory.getLogger(NumberOf1BitsTest.class);

    @Test
    public void testHammingWeight() throws Exception {
        NumberOf1Bits numberOf1Bits = new NumberOf1Bits();
        Stopwatch stopwatch = Stopwatch.createStarted();

        Assert.assertEquals(0, numberOf1Bits.hammingWeight(0));
        Assert.assertEquals(1, numberOf1Bits.hammingWeight(1));
        Assert.assertEquals(1, numberOf1Bits.hammingWeight(2));
        Assert.assertEquals(2, numberOf1Bits.hammingWeight(3));
        Assert.assertEquals(1, numberOf1Bits.hammingWeight(4));
        Assert.assertEquals(3, numberOf1Bits.hammingWeight(11));
        Assert.assertEquals(3, numberOf1Bits.hammingWeight(100));
        Assert.assertEquals(31, numberOf1Bits.hammingWeight(Integer.MAX_VALUE));
        Assert.assertEquals(1, numberOf1Bits.hammingWeight(Integer.MIN_VALUE));
        Assert.assertEquals(32, numberOf1Bits.hammingWeight(-1));
        Assert.assertEquals(31, numberOf1Bits.hammingWeight(-2));
        Assert.assertEquals(31, numberOf1Bits.hammingWeight(-3));
        Assert.assertEquals(31, numberOf1Bits.hammingWeight(-5));

        logger.info("testHammingWeight spend: {}ms", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));
    }

    /*@Test
    public void testPopCount_32bit() throws Exception {
        NumberOf1Bits numberOf1Bits = new NumberOf1Bits();

        Stopwatch stopwatch = Stopwatch.createStarted();


        Assert.assertEquals(0, numberOf1Bits.popCount_32bit(0));
        Assert.assertEquals(1, numberOf1Bits.popCount_32bit(1));
        Assert.assertEquals(1, numberOf1Bits.popCount_32bit(2));
        Assert.assertEquals(2, numberOf1Bits.popCount_32bit(3));
        Assert.assertEquals(1, numberOf1Bits.popCount_32bit(4));
        Assert.assertEquals(3, numberOf1Bits.popCount_32bit(11));
        Assert.assertEquals(3, numberOf1Bits.popCount_32bit(100));
        Assert.assertEquals(31, numberOf1Bits.popCount_32bit(Integer.MAX_VALUE));
        Assert.assertEquals(1, numberOf1Bits.popCount_32bit(Integer.MIN_VALUE));
        Assert.assertEquals(32, numberOf1Bits.popCount_32bit(-1));
        Assert.assertEquals(31, numberOf1Bits.popCount_32bit(-2));
        Assert.assertEquals(31, numberOf1Bits.popCount_32bit(-3));
        Assert.assertEquals(31, numberOf1Bits.popCount_32bit(-5));

        logger.info("testPopCount_32bit spend: {}ms",stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));
    }*/
}