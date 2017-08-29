package com.leetcode.oj.problem.solution.easy;

import com.leetcode.oj.problem.solution.common.BigDataReader;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DistributeCandiesTest {
    DistributeCandies dis = null;
    int[] bigCandies = null;
    String bigCandiesTxtPath = "D:\\IdeaWorkspace\\LeetCodeSolutions\\src\\test\\java\\com\\leetcode\\oj\\problem\\solution\\easy\\DistributeCandies.txt";

    @Before
    public void setUp() throws Exception {
        dis = new DistributeCandies();
        bigCandies = BigDataReader.readInt(bigCandiesTxtPath, BigDataReader.Sep.comma);
    }

    @After
    public void tearDown() throws Exception {
        dis = null;
        bigCandies = null;
    }

    @Test
    public void distributeCandies() throws Exception {
        Assert.assertEquals(1, dis.distributeCandies(new int[]{1, 1, 1, 1}));
        Assert.assertEquals(2, dis.distributeCandies(new int[]{1, 1, 2, 3}));
        Assert.assertEquals(3, dis.distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
    }

    @Test
    public void distributeCandiesBig() throws Exception {
        Assert.assertEquals(4500, dis.distributeCandies(bigCandies));
    }

    @Test
    public void distributeCandiesByReduceSpace() throws Exception {
        Assert.assertEquals(1, dis.distributeCandiesByReduceSpace(new int[]{1, 11}));
        Assert.assertEquals(2, dis.distributeCandiesByReduceSpace(new int[]{1, 1, 2, 3}));
        Assert.assertEquals(3, dis.distributeCandiesByReduceSpace(new int[]{1, 1, 2, 2, 3, 3}));
        Assert.assertEquals(2, dis.distributeCandiesByReduceSpace(new int[]{1, 1, 1, 3, 3, 3}));
    }

    @Test
    public void distributeCandiesByReduceSpaceBig() throws Exception {
        Assert.assertEquals(4500, dis.distributeCandiesByReduceSpace(bigCandies));
    }
}