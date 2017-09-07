package com.leetcode.oj.problem.solution.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wli on 2017-09-07.
 */
public class NextGreaterElementIITest {

    NextGreaterElementII next = new NextGreaterElementII();

    @Test(expected = IllegalArgumentException.class)
    public void argIsNull() {
        next.nextGreaterElements(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void argIsEmpty() {
        next.nextGreaterElements(new int[]{});
    }

    @Test
    public void nextGreaterElements() throws Exception {
        next = new NextGreaterElementII();
        Assert.assertArrayEquals(new int[]{5, 6, 6, 8, -1}, next.nextGreaterElements(new int[]{1, 5, 3, 6, 8}));
        Assert.assertArrayEquals(new int[]{-1}, next.nextGreaterElements(new int[]{1}));
        Assert.assertArrayEquals(new int[]{-1, 5, 5, 5, 5}, next.nextGreaterElements(new int[]{5, 4, 3, 2, 1}));
        Assert.assertArrayEquals(new int[]{2, 3, 4, -1, 4}, next.nextGreaterElements(new int[]{1, 2, 3, 4, 3}));
        Assert.assertArrayEquals(new int[]{2, -1, 2}, next.nextGreaterElements(new int[]{1, 2, 1}));
        Assert.assertArrayEquals(new int[]{2, 3, 4, 5, 6, -1, 2}, next.nextGreaterElements(new int[]{1, 2, 3, 4, 5, 6, 1}));
    }

}