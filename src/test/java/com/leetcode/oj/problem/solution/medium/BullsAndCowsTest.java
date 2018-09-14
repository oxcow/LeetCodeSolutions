package com.leetcode.oj.problem.solution.medium;

import org.junit.Assert;
import org.junit.Test;

public class BullsAndCowsTest {

    @Test
    public void getHint() {
        BullsAndCows bullsAndCows = new BullsAndCows();
        Assert.assertEquals("1A3B", bullsAndCows.getHint("1807", "7810"));
        Assert.assertEquals("1A1B", bullsAndCows.getHint("1123", "0111"));
        Assert.assertEquals("4A0B", bullsAndCows.getHint("1111", "1111"));
        Assert.assertEquals("0A4B", bullsAndCows.getHint("1221", "2112"));
        Assert.assertEquals("0A1B", bullsAndCows.getHint("1122", "0001"));
    }
}