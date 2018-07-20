package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class RotatedDigitsTest {

    @Test
    public void rotatedDigits() {
        RotatedDigits digits = new RotatedDigits();

        Assert.assertEquals(4, digits.rotatedDigits(10));
        Assert.assertEquals(9, digits.rotatedDigits(20));
        Assert.assertEquals(15, digits.rotatedDigits(30));
        Assert.assertEquals(15, digits.rotatedDigits(40));
        Assert.assertEquals(16, digits.rotatedDigits(50));
        Assert.assertEquals(23, digits.rotatedDigits(60));

    }

    @Test
    public void rotatedDigitsBig(){
        RotatedDigits digits = new RotatedDigits();
        Assert.assertEquals(247, digits.rotatedDigits(857));
    }
}