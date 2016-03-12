package com.leetcode.oj.problem.solution.easy;

import com.google.common.base.Stopwatch;
import junit.framework.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class PlusOneTest {
    private Logger logger = LoggerFactory.getLogger(PlusOneTest.class);

    private String toString(int[] i) {
        StringBuilder sb = new StringBuilder();
        for (int i1 : i) {
            sb.append(i1);
        }
        return sb.toString();
    }

    @Test
    public void testPlusOne() throws Exception {
        Stopwatch stopwatch  = Stopwatch.createStarted();

        PlusOne plusOne = new PlusOne();
        Assert.assertEquals("9000", toString(plusOne.plusOne(new int[]{8, 9, 9, 9})));
        Assert.assertEquals("10000", toString(plusOne.plusOne(new int[]{9, 9, 9, 9})));

        logger.info("spend: {}mico",stopwatch.stop().elapsed(TimeUnit.MICROSECONDS));
    }
}