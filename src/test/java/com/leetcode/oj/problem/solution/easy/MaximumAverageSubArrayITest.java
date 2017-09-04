package com.leetcode.oj.problem.solution.easy;

import com.leetcode.oj.problem.solution.common.BigDataReader;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wli on 2017-09-04.
 */
public class MaximumAverageSubArrayITest {

    double DEFAULT_DELTA = 10E-20;
    MaximumAverageSubArrayI maxAvgSub;

    String basePath = "D:\\WorkSpace\\myWorkspace\\LeetCodeSolutions\\src\\test\\java\\com\\leetcode\\oj\\problem\\solution\\easy\\MaximumAverageSubArrayI.txt";

    private int[] moreBigArray = BigDataReader.readInt(basePath, BigDataReader.Sep.comma);


    @Before
    public void setUp() throws Exception {
        maxAvgSub = new MaximumAverageSubArrayI();
    }

    @After
    public void tearDown() throws Exception {
        maxAvgSub = null;
    }

    @Test
    public void findMaxAverage() throws Exception {
        Assert.assertEquals(-1, maxAvgSub.findMaxAverage(new int[]{-1}, 1), DEFAULT_DELTA);
        Assert.assertEquals(12.75, maxAvgSub.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4), DEFAULT_DELTA);
    }

    @Test
    public void findMaxAvgMoreBigArray() throws Exception {
        Assert.assertEquals(29.20299500831947, maxAvgSub.findMaxAverage(moreBigArray, 12020), DEFAULT_DELTA);
    }

}