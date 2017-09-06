package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by wli on 2017-09-05.
 */
public class ArrangingCoinsTest {
    @Test
    public void arrangeCoins() throws Exception {
        ArrangingCoins ac = new ArrangingCoins();
        Assert.assertEquals(0, ac.arrangeCoins(0));
        Assert.assertEquals(1, ac.arrangeCoins(1));
        Assert.assertEquals(2, ac.arrangeCoins(4));
        Assert.assertEquals(2, ac.arrangeCoins(5));
        Assert.assertEquals(3, ac.arrangeCoins(6));
        Assert.assertEquals(3, ac.arrangeCoins(8));
        Assert.assertEquals(4, ac.arrangeCoins(10));
    }

}