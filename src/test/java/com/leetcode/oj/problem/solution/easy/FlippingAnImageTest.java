package com.leetcode.oj.problem.solution.easy;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FlippingAnImageTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void flipAndInvertImage() {
        FlippingAnImage flippingAnImage = new FlippingAnImage();

        int[][] input = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int out[][] = flippingAnImage.flipAndInvertImage(input);
        int result[][] = new int[][]{{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};

        Assert.assertArrayEquals(result, out);
        Assert.assertArrayEquals(result, input);


        int[][] input1 = new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int out1[][] = flippingAnImage.flipAndInvertImage(input1);
        int result1[][] = new int[][]{{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};

        Assert.assertArrayEquals(result1, out1);
        Assert.assertArrayEquals(result1, input1);

    }
}