package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArrayTest {

    @Test
    public void merge() {
        MergeSortedArray array = new MergeSortedArray();

        int[] num1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] num2 = new int[]{2, 5, 6};

        array.merge(num1, 3, num2, 3);

        Assert.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, num1);
    }

    @Test
    public void merge1() {
        MergeSortedArray array = new MergeSortedArray();

        int[] num1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] num2 = new int[]{2, 5, 6};

        array.merge1(num1, 3, num2, 3);
        Assert.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, num1);


        num1 = new int[]{2, 5, 6, 0, 0, 0};
        num2 = new int[]{1, 2, 3};

        array.merge1(num1, 3, num2, 3);
        Assert.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, num1);

        num1 = new int[]{1, 2, 4, 5, 6, 0};
        num2 = new int[]{3};

        array.merge1(num1, 5, num2, 1);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, num1);


        num1 = new int[]{1, 2,3, 4, 5,  0};
        num2 = new int[]{6};

        array.merge1(num1, 5, num2, 1);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, num1);
    }
}