package com.leetcode.oj.problem.solution.easy;

import com.leetcode.oj.problem.solution.common.BigDataReader;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wli on 2017-08-30.
 */
public class HouseRobberTest {
    HouseRobber robber = null;
    int[] bigDate = null;
    String bigDatePath = "D:\\WorkSpace\\myWorkspace\\LeetCodeSolutions\\src\\test\\java\\com\\leetcode\\oj\\problem\\solution\\easy\\MinimumMovesToEqualArrayElements.txt";

    @Before
    public void setUp() throws Exception {
        robber = new HouseRobber();
        bigDate = BigDataReader.readInt(bigDatePath, BigDataReader.Sep.comma);
    }

    @After
    public void tearDown() throws Exception {
        robber = null;
        bigDate = null;
    }

    @Test
    public void rob() throws Exception {
        Assert.assertEquals(0, robber.rob(new int[]{}));
        Assert.assertEquals(2, robber.rob(new int[]{2}));
        Assert.assertEquals(110, robber.rob(new int[]{10, 60, 30, 40, 50}));
        Assert.assertEquals(14, robber.rob(new int[]{4, 1, 2, 7, 5, 3, 1}));
        Assert.assertEquals(2930864, robber.rob(bigDate));
    }

}