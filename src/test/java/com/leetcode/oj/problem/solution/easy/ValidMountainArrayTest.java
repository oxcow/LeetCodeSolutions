package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class ValidMountainArrayTest {

    @Test
    public void validMountainArray() {
        ValidMountainArray array = new ValidMountainArray();
        Assert.assertFalse(array.validMountainArray(new int[]{2, 1}));
        Assert.assertFalse(array.validMountainArray(new int[]{3, 5, 5}));
        Assert.assertTrue(array.validMountainArray(new int[]{0, 3, 2, 1}));
        Assert.assertTrue(array.validMountainArray(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1}));
        Assert.assertFalse(array.validMountainArray(new int[]{1, 2, 3, 4, 5}));
        Assert.assertFalse(array.validMountainArray(new int[]{5, 4, 3, 2, 1}));
        Assert.assertFalse(array.validMountainArray(new int[]{5, 4, 3, 2, 1, 0, 1}));
    }
}