package com.leetcode.oj.problem.solution.medium;

import junit.framework.Assert;
import org.junit.Test;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    FindFirstAndLastPositionOfElementInSortedArray ffl = new FindFirstAndLastPositionOfElementInSortedArray();

    @Test
    public void searchRange() {

        int[] result = ffl.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);

        Assert.assertEquals(3, result[0]);
        Assert.assertEquals(4, result[1]);

        result = ffl.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);

        Assert.assertEquals(-1, result[0]);
        Assert.assertEquals(-1, result[1]);


        result = ffl.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 10);

        Assert.assertEquals(5, result[0]);
        Assert.assertEquals(5, result[1]);


        result = ffl.searchRange(new int[]{7, 7, 7, 7, 7, 7}, 7);

        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(5, result[1]);
    }
}