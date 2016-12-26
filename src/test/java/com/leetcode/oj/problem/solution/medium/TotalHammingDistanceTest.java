package com.leetcode.oj.problem.solution.medium;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
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


    private int[] getBigTestNum(File file) throws Exception {
        logger.debug("start init big num array ...");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter(",");
        List<Integer> numList = Lists.newArrayList();
        while (scanner.hasNext()) {
            numList.add(Integer.valueOf(scanner.next().trim()));
        }
        int[] bigNums = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            bigNums[i] = numList.get(i);
        }
        logger.debug("end init big num array, size:{}", bigNums.length);
        return bigNums;
    }

    //@Test
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

        int[] bigNum = getBigTestNum(new File("E:\\workspace\\javaspace\\LeetCodeSolutions\\src\\test\\java\\com\\leetcode\\oj\\problem\\solution\\medium\\TotalHammingDistance.txt"));
        Assert.assertEquals(748425216, thd.totalHammingDistance(bigNum));

        bigNum = getBigTestNum(new File("E:\\workspace\\javaspace\\LeetCodeSolutions\\src\\test\\java\\com\\leetcode\\oj\\problem\\solution\\medium\\TotalHammingDistance1.txt"));
        Assert.assertEquals(748664583, thd.totalHammingDistance(bigNum));

        bigNum = getBigTestNum(new File("E:\\workspace\\javaspace\\LeetCodeSolutions\\src\\test\\java\\com\\leetcode\\oj\\problem\\solution\\medium\\TotalHammingDistance2.txt"));
        Assert.assertEquals(725000000, thd.totalHammingDistance(bigNum));

        logger.info("test big arrays spend:{}ms", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));
    }

    @Test
    public void testTotalHammingDistance2() throws Exception {

        Stopwatch stopwatch = Stopwatch.createStarted();
        TotalHammingDistance thd = new TotalHammingDistance();

        int[] bigNum = getBigTestNum(new File("E:\\workspace\\javaspace\\LeetCodeSolutions\\src\\test\\java\\com\\leetcode\\oj\\problem\\solution\\medium\\TotalHammingDistance.txt"));
        Assert.assertEquals(748425216, thd.totalHammingDistance2(bigNum));

        bigNum = getBigTestNum(new File("E:\\workspace\\javaspace\\LeetCodeSolutions\\src\\test\\java\\com\\leetcode\\oj\\problem\\solution\\medium\\TotalHammingDistance1.txt"));
        Assert.assertEquals(748664583, thd.totalHammingDistance2(bigNum));

        bigNum = getBigTestNum(new File("E:\\workspace\\javaspace\\LeetCodeSolutions\\src\\test\\java\\com\\leetcode\\oj\\problem\\solution\\medium\\TotalHammingDistance2.txt"));
        Assert.assertEquals(725000000, thd.totalHammingDistance2(bigNum));

        logger.info("test totalHammingDistance2 spend:{}ms", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));
    }
}