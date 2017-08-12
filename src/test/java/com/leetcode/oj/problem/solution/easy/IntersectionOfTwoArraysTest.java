package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

import static com.leetcode.oj.problem.solution.easy.IntersectionOfTwoArrays.EMPTY_INT;

/**
 * Created by leeyee on 2017/8/12.
 */
public class IntersectionOfTwoArraysTest {
    @Test
    public void intersection() throws Exception {

        IntersectionOfTwoArrays iota = new IntersectionOfTwoArrays();

        Assert.assertArrayEquals(EMPTY_INT, iota.intersection(null, null));
        Assert.assertArrayEquals(EMPTY_INT, iota.intersection(null, new int[]{2}));
        Assert.assertArrayEquals(EMPTY_INT, iota.intersection(new int[]{1}, null));

        Assert.assertArrayEquals(EMPTY_INT, iota.intersection(new int[]{1}, new int[]{2}));

        Assert.assertArrayEquals(new int[]{1}, iota.intersection(new int[]{1, 2}, new int[]{1, 1}));

        Assert.assertArrayEquals(new int[]{1}, iota.intersection(new int[]{1}, new int[]{1}));

        Assert.assertArrayEquals(new int[]{2}, iota.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));

        Assert.assertArrayEquals(new int[]{4, 6}, iota.intersection(new int[]{4, 7, 9, 7, 6, 7}, new int[]{5, 0, 0, 6, 1, 6, 2, 2, 4}));

    }

}