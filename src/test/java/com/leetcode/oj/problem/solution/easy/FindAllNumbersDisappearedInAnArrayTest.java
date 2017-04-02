package com.leetcode.oj.problem.solution.easy;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.leetcode.oj.problem.solution.medium.TotalHammingDistanceTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/4/2.
 */
public class FindAllNumbersDisappearedInAnArrayTest {
    private static final Logger logger = LoggerFactory.getLogger(FindAllNumbersDisappearedInAnArrayTest.class);

    private int[] bigInt = null;

    @Before
    public void init() throws Exception {
        Stopwatch stopwatch = Stopwatch.createStarted();
        logger.info("start init big num array ...");
        Scanner scanner = new Scanner(new File("/Users/leeyee/Documents/javaworkspace/LeetCodeSolutions/src/test/java/com/leetcode/oj/problem/solution/easy/big_int.txt"));
        scanner.useDelimiter(",");
        List<Integer> numList = Lists.newArrayList();
        while (scanner.hasNext()) {
            numList.add(Integer.valueOf(scanner.next().trim()));
        }
        int[] bigNums = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            bigNums[i] = numList.get(i);
        }
        bigInt = bigNums;
        logger.info("end init big num array, size:{}, spend:{}ms", bigNums.length, stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));
    }

    @Test
    public void findDisappearedNumbers() throws Exception {

        FindAllNumbersDisappearedInAnArray find = new FindAllNumbersDisappearedInAnArray();

        Assert.assertArrayEquals(Lists.newArrayList(5, 6).toArray()
                , find.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}).toArray());

    }

    @Test
    public void testBigIntFind() {
        FindAllNumbersDisappearedInAnArray find = new FindAllNumbersDisappearedInAnArray();

        Stopwatch stopwatch = Stopwatch.createStarted();

        List<Integer> disappeared = find.findDisappearedNumbers(bigInt);

        logger.info("big num handle spend: {}ms", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));

        Assert.assertEquals(15843, disappeared.size());
    }
}