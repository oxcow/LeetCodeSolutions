package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/8/11.
 */
public class ArrayPartitionITest {
    @Test
    public void arrayPairSum() throws Exception {
        ArrayPartitionI api = new ArrayPartitionI();

        Assert.assertEquals(7, api.arrayPairSum(new int[]{7, 3, 1, 0, 0, 6}));

        Assert.assertEquals(1, api.arrayPairSum(new int[]{1, 1}));

        Assert.assertEquals(4, api.arrayPairSum(new int[]{1, 4, 3, 2}));
    }

}