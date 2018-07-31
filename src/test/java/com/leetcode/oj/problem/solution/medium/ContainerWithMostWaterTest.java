package com.leetcode.oj.problem.solution.medium;

import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWaterTest {

    @Test
    public void maxArea() {
        ContainerWithMostWater water = new ContainerWithMostWater();

        Assert.assertEquals(49, water.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}