package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class TransposeMatrixTest {

    @Test
    public void transpose() {
        TransposeMatrix matrix = new TransposeMatrix();

        Assert.assertArrayEquals(new int[][]{{1, 4}, {2, 5}, {3, 6}}
                , matrix.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}}));

        Assert.assertArrayEquals(new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}
                , matrix.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));

    }
}