package com.leetcode.oj.problem.solution.easy;

import com.google.common.base.Stopwatch;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class HammingDistanceTest {

    private HammingDistance hd;

    @Before
    public void init() {
        hd = new HammingDistance();
    }

    @After
    public void destroy() {
        hd = null;
    }

    @Test
    public void testHammingDistance() throws Exception {
        Stopwatch stopwatch = Stopwatch.createStarted();
        Assert.assertEquals(1, hd.hammingDistance(0, 1));
        Assert.assertEquals(2, hd.hammingDistance(1, 4));
        Assert.assertEquals(3, hd.hammingDistance(0, 7));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        System.out.println(stopwatch.stop().elapsed(TimeUnit.NANOSECONDS));
    }

    @Test
    public void testHammingDistanceUseBitSet() throws Exception {
        Stopwatch stopwatch = Stopwatch.createStarted();
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(0, 1));
        Assert.assertEquals(2, hd.hammingDistanceUseBitSet(1, 4));
        Assert.assertEquals(3, hd.hammingDistanceUseBitSet(0, 7));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        Assert.assertEquals(1, hd.hammingDistanceUseBitSet(Integer.MAX_VALUE, Integer.MAX_VALUE - 1));
        System.out.println(stopwatch.stop().elapsed(TimeUnit.NANOSECONDS));
    }
}