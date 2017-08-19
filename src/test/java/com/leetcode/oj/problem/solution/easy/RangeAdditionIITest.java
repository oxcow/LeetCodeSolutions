package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leeyee on 2017/8/19.
 */
public class RangeAdditionIITest {

    @Test
    public void maxCount() throws Exception {
        RangeAdditionII ra = new RangeAdditionII();
        Assert.assertEquals(6, ra.maxCount(2, 3, new int[][]{}));
        Assert.assertEquals(1, ra.maxCount(1, 1, new int[][]{{1, 1}}));
        Assert.assertEquals(2, ra.maxCount(3, 3, new int[][]{{1, 2}, {1,2},{1,2}, {3, 3}}));

    }

}