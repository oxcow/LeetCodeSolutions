package com.leetcode.oj.problem.solution.medium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/5/13.
 */
public class SingleNumberIITest {
    @Test
    public void singleNumber() throws Exception {
        SingleNumberII numberII = new SingleNumberII();
        Assert.assertEquals(1, numberII.singleNumber(new int[]{1, 2, 3, 2, 3, 2, 3}));
        Assert.assertEquals(1, numberII.singleNumber(new int[]{1, 2, 2, 2, 3, 3, 3}));
    }

}