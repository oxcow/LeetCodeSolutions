package com.leetcode.oj.problem.solution.medium;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.leetcode.oj.problem.solution.common.BigDataReader;
import junit.framework.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TotalHammingDistanceTest {
    private static final Logger logger = LoggerFactory.getLogger(TotalHammingDistanceTest.class);

    BigDataReader.Sep sep = BigDataReader.Sep.comma;

    String basePath = "/Users/leeyee/Documents/javaworkspace/LeetCodeSolutions/src/test/java/com/leetcode/oj/problem/solution/medium/";


    @Test
    public void testTotalHammingDistance() throws Exception {
        Stopwatch stopwatch = Stopwatch.createStarted();
        TotalHammingDistance thd = new TotalHammingDistance();
        int maxVal = Integer.MAX_VALUE;
        Assert.assertEquals(0, thd.totalHammingDistance(new int[]{0, 0, 0}));
        Assert.assertEquals(0, thd.totalHammingDistance(new int[]{maxVal, maxVal, maxVal}));
        Assert.assertEquals(4, thd.totalHammingDistance(new int[]{1, 2, 3}));
        Assert.assertEquals(6, thd.totalHammingDistance(new int[]{4, 2, 14}));
        int nums[] = new int[32];
        for (int i = 0; i < 32; i++) {
            nums[i] = maxVal;
        }
        Assert.assertEquals(0, thd.totalHammingDistance(nums));
        logger.info("test normal spend:{}ms", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));
    }

    @Test
    public void testBigNums() throws Exception {
        Stopwatch stopwatch = Stopwatch.createStarted();
        TotalHammingDistance thd = new TotalHammingDistance();


        int[] bigNum = BigDataReader.readInt(basePath + "TotalHammingDistance.txt", sep);
        Assert.assertEquals(748425216, thd.totalHammingDistance(bigNum));

        bigNum = BigDataReader.readInt(basePath + "TotalHammingDistance1.txt", sep);
        Assert.assertEquals(748664583, thd.totalHammingDistance(bigNum));

        bigNum = BigDataReader.readInt(basePath + "TotalHammingDistance2.txt", sep);
        Assert.assertEquals(725000000, thd.totalHammingDistance(bigNum));

        logger.info("test big arrays spend:{}ms", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));
    }

    @Test
    public void testTotalHammingDistance2() throws Exception {

        Stopwatch stopwatch = Stopwatch.createStarted();
        TotalHammingDistance thd = new TotalHammingDistance();


        int[] bigNum = BigDataReader.readInt(basePath + "TotalHammingDistance.txt", sep);
        Assert.assertEquals(748425216, thd.totalHammingDistance2(bigNum));

        bigNum = BigDataReader.readInt(basePath + "TotalHammingDistance1.txt", sep);
        Assert.assertEquals(748664583, thd.totalHammingDistance2(bigNum));

        bigNum = BigDataReader.readInt(basePath + "TotalHammingDistance2.txt", sep);
        Assert.assertEquals(725000000, thd.totalHammingDistance2(bigNum));

        logger.info("test totalHammingDistance2 spend:{}ms", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));
    }
}