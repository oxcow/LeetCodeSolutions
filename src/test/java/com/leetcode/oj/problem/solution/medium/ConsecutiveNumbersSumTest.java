package com.leetcode.oj.problem.solution.medium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersSumTest {

    @Test
    public void consecutiveNumbersSum() {
        ConsecutiveNumbersSum numbersSum = new ConsecutiveNumbersSum();

        Assert.assertEquals(1, numbersSum.consecutiveNumbersSum(1));
        Assert.assertEquals(1, numbersSum.consecutiveNumbersSum(2));
        Assert.assertEquals(2, numbersSum.consecutiveNumbersSum(3));
        Assert.assertEquals(2, numbersSum.consecutiveNumbersSum(5));
        Assert.assertEquals(3, numbersSum.consecutiveNumbersSum(9));
        Assert.assertEquals(4, numbersSum.consecutiveNumbersSum(15));
        Assert.assertEquals(3, numbersSum.consecutiveNumbersSum(100));
        Assert.assertEquals(16, numbersSum.consecutiveNumbersSum(1000000002));
    }
}