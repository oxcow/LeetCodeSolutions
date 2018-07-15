package com.leetcode.oj.problem.solution.medium;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerReplacementTest {

    @Test
    public void integerReplacement() {
        IntegerReplacement replacement = new IntegerReplacement();
        Assert.assertEquals(3, replacement.integerReplacement(8));
        Assert.assertEquals(4, replacement.integerReplacement(7));
        Assert.assertEquals(5, replacement.integerReplacement(13));
        Assert.assertEquals(5, replacement.integerReplacement(17));
        Assert.assertEquals(32, replacement.integerReplacement(Integer.MAX_VALUE - 1));
        Assert.assertEquals(32, replacement.integerReplacement(Integer.MAX_VALUE));
    }
}