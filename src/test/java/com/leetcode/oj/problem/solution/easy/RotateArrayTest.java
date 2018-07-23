package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {

    @Test
    public void rotate() {
        RotateArray array = new RotateArray();

        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        array.rotate(input, 3);
        Assert.assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, input);


        input = new int[]{-1, -100, 3, 99};
        array.rotate(input, 2);
        Assert.assertArrayEquals(new int[]{3, 99, -1, -100}, input);

    }

    @Test
    public void rotateSpaceN() {
        RotateArray array = new RotateArray();

        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        array.rotateBySpaceN(input, 3);
        Assert.assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, input);


        input = new int[]{-1, -100, 3, 99};
        array.rotateBySpaceN(input, 2);
        Assert.assertArrayEquals(new int[]{3, 99, -1, -100}, input);

    }

    @Test
    public void rotateSpaceK() {
        RotateArray array = new RotateArray();

        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        array.rotateBySpaceK(input, 3);
        Assert.assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, input);


        input = new int[]{-1, -100, 3, 99};
        array.rotateBySpaceK(input, 2);
        Assert.assertArrayEquals(new int[]{3, 99, -1, -100}, input);

    }
}