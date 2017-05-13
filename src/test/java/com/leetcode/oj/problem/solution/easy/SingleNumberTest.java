package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/5/13.
 */
public class SingleNumberTest {
    @Test
    public void singleNumber() throws Exception {
        SingleNumber singleNumber = new SingleNumber();
        Assert.assertEquals(1, singleNumber.singleNumber(new int[]{1, 2, 3, 2, 3}));
        Assert.assertEquals(2, singleNumber.singleNumber(new int[]{1, 1, 3, 2, 3}));
        Assert.assertEquals(3, singleNumber.singleNumber(new int[]{1, 2, 1, 2, 3}));
    }

}