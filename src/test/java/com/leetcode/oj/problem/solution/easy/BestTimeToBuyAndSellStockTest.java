package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void maxProfit() {

        BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();

        Assert.assertEquals(5, stock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assert.assertEquals(0, stock.maxProfit(new int[]{7, 6, 4, 3, 1}));
        Assert.assertEquals(0, stock.maxProfit(new int[]{7}));
        Assert.assertEquals(1, stock.maxProfit(new int[]{1,2}));
        Assert.assertEquals(0, stock.maxProfit1(new int[]{}));
    }

    @Test
    public void maxProfit1() {

        BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();

        Assert.assertEquals(5, stock.maxProfit1(new int[]{7, 1, 5, 3, 6, 4}));
        Assert.assertEquals(0, stock.maxProfit1(new int[]{7, 6, 4, 3, 1}));
        Assert.assertEquals(0, stock.maxProfit1(new int[]{7}));
        Assert.assertEquals(1, stock.maxProfit1(new int[]{1,2}));
        Assert.assertEquals(0, stock.maxProfit1(new int[]{}));
    }
}