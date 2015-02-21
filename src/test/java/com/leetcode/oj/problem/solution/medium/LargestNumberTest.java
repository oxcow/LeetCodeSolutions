package com.leetcode.oj.problem.solution.medium;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargestNumberTest {
    @Test
    public void testLargestNumber() throws Exception {
        LargestNumber largestNumber = new LargestNumber();
        Assert.assertEquals("", largestNumber.largestNumber(null));
        Assert.assertEquals("", largestNumber.largestNumber(new int[]{}));
        Assert.assertEquals("0", largestNumber.largestNumber(new int[]{0}));
        Assert.assertEquals("0", largestNumber.largestNumber(new int[]{0}));
        Assert.assertEquals("0", largestNumber.largestNumber(new int[]{0, 0}));
        Assert.assertEquals("10", largestNumber.largestNumber(new int[]{0, 1}));
        Assert.assertEquals("100", largestNumber.largestNumber(new int[]{0, 0, 1}));
        Assert.assertEquals("201", largestNumber.largestNumber(new int[]{1, 20}));
        Assert.assertEquals("12121", largestNumber.largestNumber(new int[]{121, 12}));
        Assert.assertEquals("12121", largestNumber.largestNumber(new int[]{12, 121}));
        Assert.assertEquals("21221", largestNumber.largestNumber(new int[]{21, 212}));
        Assert.assertEquals("21221", largestNumber.largestNumber(new int[]{212, 21}));
        Assert.assertEquals("223222", largestNumber.largestNumber(new int[]{22, 2232}));
        Assert.assertEquals("1290112311111034110", largestNumber.largestNumber(new int[]{1, 11, 110, 1123, 11034, 1290}));
        Assert.assertEquals("9534330", largestNumber.largestNumber(new int[]{3, 30, 34, 5, 9}));
        Assert.assertEquals("9609938824824769735703560743981399", largestNumber.largestNumber(new int[]{824, 938, 1399, 5607, 6973, 5703, 9609, 4398, 8247}));
    }
}