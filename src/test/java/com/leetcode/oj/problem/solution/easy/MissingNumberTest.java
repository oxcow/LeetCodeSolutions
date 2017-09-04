package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/09/04.
 */
public class MissingNumberTest {
    @Test(expected = RuntimeException.class)
    public void testException() {
        MissingNumber mn = new MissingNumber();
        mn.missingNumber(null);
    }

    @Test
    public void missingNumber() throws Exception {
        MissingNumber mn = new MissingNumber();
        Assert.assertEquals(1, mn.missingNumber(new int[]{0}));
        Assert.assertEquals(0, mn.missingNumber(new int[]{1}));
        Assert.assertEquals(1, mn.missingNumber(new int[]{3, 0, 2}));
        Assert.assertEquals(1, mn.missingNumber(new int[]{0, 2, 3}));
        Assert.assertEquals(0, mn.missingNumber(new int[]{1, 2, 3}));
        Assert.assertEquals(9, mn.missingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 10}));
    }
    @Test
    public void missingNumberBySum() throws Exception {
        MissingNumber mn = new MissingNumber();
        Assert.assertEquals(1, mn.missingNumberBySum(new int[]{0}));
        Assert.assertEquals(0, mn.missingNumberBySum(new int[]{1}));
        Assert.assertEquals(1, mn.missingNumberBySum(new int[]{3, 0, 2}));
        Assert.assertEquals(1, mn.missingNumberBySum(new int[]{0, 2, 3}));
        Assert.assertEquals(0, mn.missingNumberBySum(new int[]{1, 2, 3}));
        Assert.assertEquals(9, mn.missingNumberBySum(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 10}));
    }
}