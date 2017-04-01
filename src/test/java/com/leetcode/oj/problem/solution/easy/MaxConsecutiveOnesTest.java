package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/4/2.
 */
public class MaxConsecutiveOnesTest {

    @Test
    public void findMaxConsecutiveOnes() throws Exception {
        MaxConsecutiveOnes ones = new MaxConsecutiveOnes();

        Assert.assertEquals(0, ones.findMaxConsecutiveOnes(new int[]{0}));
        Assert.assertEquals(1, ones.findMaxConsecutiveOnes(new int[]{1}));
        Assert.assertEquals(2, ones.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
        Assert.assertEquals(3, ones.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }

}