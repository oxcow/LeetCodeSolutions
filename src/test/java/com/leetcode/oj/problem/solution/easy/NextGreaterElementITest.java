package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/4/1.
 */
public class NextGreaterElementITest {
    @Test
    public void nextGreaterElement() throws Exception {
        NextGreaterElementI elementI = new NextGreaterElementI();

        Assert.assertArrayEquals(new int[]{7, 7, 7, 7, 7}
                , elementI.nextGreaterElement(new int[]{1, 3, 5, 2, 4}, new int[]{6, 5, 4, 3, 2, 1, 7}));

        Assert.assertArrayEquals(new int[]{-1, 3, -1}
                , elementI.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));

        Assert.assertArrayEquals(new int[]{3, -1}
                , elementI.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4}));

    }

}