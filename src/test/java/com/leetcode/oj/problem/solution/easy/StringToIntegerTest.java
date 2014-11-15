package com.leetcode.oj.problem.solution.easy;


import org.junit.Assert;
import org.junit.Test;

public class StringToIntegerTest {

    @Test
    public void testAtoi() throws Exception {

        Assert.assertEquals(0, StringToInteger.atoi(""));
        Assert.assertEquals(0, StringToInteger.atoi(null));
        Assert.assertEquals(0, StringToInteger.atoi("   +0 123"));
        Assert.assertEquals(0, StringToInteger.atoi(" fd123 123"));
        Assert.assertEquals(-12, StringToInteger.atoi("  -0012a42"));
        Assert.assertEquals(2, StringToInteger.atoi("+2"));
        Assert.assertEquals(2, StringToInteger.atoi("+2-"));
        Assert.assertEquals(0, StringToInteger.atoi("+-2"));
        Assert.assertEquals(0, StringToInteger.atoi("-+2"));
        Assert.assertEquals(0, StringToInteger.atoi(" abc-123ABC "));
        Assert.assertEquals(123, StringToInteger.atoi(" 123"));
        Assert.assertEquals(123, StringToInteger.atoi("    123   "));
        Assert.assertEquals(123, StringToInteger.atoi("+123"));
        Assert.assertEquals(-123, StringToInteger.atoi(" -123"));
        Assert.assertEquals(123, StringToInteger.atoi("123ABC"));
        Assert.assertEquals(0, StringToInteger.atoi(" abc123ABC"));

        Assert.assertEquals(2147483647, StringToInteger.atoi("2147483647"));
        Assert.assertEquals(-2147483648, StringToInteger.atoi("-2147483648"));
        Assert.assertEquals(2147483647, StringToInteger.atoi("2147483648"));
        Assert.assertEquals(-2147483648, StringToInteger.atoi("-2147483649"));
    }
}