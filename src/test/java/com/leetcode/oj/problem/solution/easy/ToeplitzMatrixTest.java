package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class ToeplitzMatrixTest {

    @Test
    public void isToeplitzMatrix() {
        ToeplitzMatrix matrixs = new ToeplitzMatrix();

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2},
                {9, 9, 5, 1}};
        Assert.assertTrue(matrixs.isToeplitzMatrix(matrix));

        matrix = new int[][]{
                {1, 2},
                {2, 2}};
        Assert.assertFalse(matrixs.isToeplitzMatrix(matrix));
    }
}