package com.leetcode.oj.problem.solution.medium;

import com.google.common.base.Stopwatch;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class MajorityElementIITest {
    private Logger logger = LoggerFactory.getLogger(MajorityElementIITest.class);

    @Test
    public void testMajorityElement() throws Exception {
        MajorityElementII majorityElementII = new MajorityElementII();
        Stopwatch stopwatch = Stopwatch.createStarted();
        Assert.assertArrayEquals(new Object[]{2, 3}, majorityElementII.majorityElement(new int[]{2, 1, 2, 3, 2, 3, 3}).toArray());
        Assert.assertArrayEquals(new Object[]{2}, majorityElementII.majorityElement(new int[]{2, 1, 2, 3, 2}).toArray());
        Assert.assertArrayEquals(new Object[]{2}, majorityElementII.majorityElement(new int[]{2, 1, 2}).toArray());
        Assert.assertArrayEquals(new Object[]{1}, majorityElementII.majorityElement(new int[]{1}).toArray());
        Assert.assertArrayEquals(new Object[]{1, 2}, majorityElementII.majorityElement(new int[]{1, 2}).toArray());
        Assert.assertArrayEquals(new Object[]{2}, majorityElementII.majorityElement(new int[]{2, 2}).toArray());
        Assert.assertArrayEquals(new Object[]{2}, majorityElementII.majorityElement(new int[]{2, 2}).toArray());

        logger.info("testMajorityElement spend: {}ms", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));

    }

    @Test
    public void testMajorityElementUseMapLambda() throws Exception {
        MajorityElementII majorityElementII = new MajorityElementII();
        Stopwatch stopwatch = Stopwatch.createStarted();
        Assert.assertArrayEquals(new Object[]{2, 3}, majorityElementII.majorityElementUseMapLambda(new int[]{2, 1, 2, 3, 2, 3, 3}).toArray());
        Assert.assertArrayEquals(new Object[]{2}, majorityElementII.majorityElementUseMapLambda(new int[]{2, 1, 2, 3, 2}).toArray());
        Assert.assertArrayEquals(new Object[]{2}, majorityElementII.majorityElementUseMapLambda(new int[]{2, 1, 2}).toArray());
        Assert.assertArrayEquals(new Object[]{1}, majorityElementII.majorityElementUseMapLambda(new int[]{1}).toArray());
        Assert.assertArrayEquals(new Object[]{1, 2}, majorityElementII.majorityElementUseMapLambda(new int[]{1, 2}).toArray());
        Assert.assertArrayEquals(new Object[]{2}, majorityElementII.majorityElementUseMapLambda(new int[]{2, 2}).toArray());
        Assert.assertArrayEquals(new Object[]{2}, majorityElementII.majorityElementUseMapLambda(new int[]{2, 2}).toArray());


        logger.info("testMajorityElementUseMapLambda spend: {}ms", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));
    }
    @Test
    public void testMajorityElementUseMap() throws Exception {
        MajorityElementII majorityElementII = new MajorityElementII();
        Stopwatch stopwatch = Stopwatch.createStarted();
        Assert.assertArrayEquals(new Object[]{2, 3}, majorityElementII.majorityElementUseMap(new int[]{2, 1, 2, 3, 2, 3, 3}).toArray());
        Assert.assertArrayEquals(new Object[]{2}, majorityElementII.majorityElementUseMap(new int[]{2, 1, 2, 3, 2}).toArray());
        Assert.assertArrayEquals(new Object[]{2}, majorityElementII.majorityElementUseMap(new int[]{2, 1, 2}).toArray());
        Assert.assertArrayEquals(new Object[]{1}, majorityElementII.majorityElementUseMap(new int[]{1}).toArray());
        Assert.assertArrayEquals(new Object[]{1, 2}, majorityElementII.majorityElementUseMap(new int[]{1, 2}).toArray());
        Assert.assertArrayEquals(new Object[]{2}, majorityElementII.majorityElementUseMap(new int[]{2, 2}).toArray());
        Assert.assertArrayEquals(new Object[]{2}, majorityElementII.majorityElementUseMap(new int[]{2, 2}).toArray());


        logger.info("testMajorityElementUseMap spend: {}ms", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));
    }
}