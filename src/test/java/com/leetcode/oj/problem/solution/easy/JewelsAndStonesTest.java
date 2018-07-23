package com.leetcode.oj.problem.solution.easy;

import com.google.common.base.Stopwatch;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by wli on 2018-01-30.
 */
public class JewelsAndStonesTest {
    public static final Logger logger = LoggerFactory.getLogger(JewelsAndStonesTest.class);

    @Test
    public void numJewelsInStones() throws Exception {
        JewelsAndStones jas = new JewelsAndStones();
        Assert.assertEquals(3, jas.numJewelsInStones("aA", "aAAbbbb"));
        Assert.assertEquals(0, jas.numJewelsInStones("z", "ZZ"));
    }

    @Test
    public void numJewelsInStonesByMap() throws Exception {
        JewelsAndStones jas = new JewelsAndStones();
        Assert.assertEquals(3, jas.numJewelsInStonesByMap("aA", "aAAbbbb"));
        Assert.assertEquals(0, jas.numJewelsInStonesByMap("z", "ZZ"));
    }

    @Test
    public void comparisonTest() throws Exception {
        JewelsAndStones jas = new JewelsAndStones();
        String J = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String S = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Stopwatch stopwatch = Stopwatch.createStarted();

        Assert.assertEquals(1040, jas.numJewelsInStones(J, S));
         logger.debug("Loop Spend: {} ms", stopwatch.stop().elapsed(TimeUnit.MICROSECONDS));

        stopwatch.reset().start();
        Assert.assertEquals(1040, jas.numJewelsInStonesByMap(J, S));
         logger.debug("Map Spend: {} ms", stopwatch.stop().elapsed(TimeUnit.MICROSECONDS));
    }
}