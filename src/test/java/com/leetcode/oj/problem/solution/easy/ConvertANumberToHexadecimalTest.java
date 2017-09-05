package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leeyee on 2017/9/5 20:58.
 */
public class ConvertANumberToHexadecimalTest {
    ConvertANumberToHexadecimal convert = new ConvertANumberToHexadecimal();

    @Test
    public void toHex() throws Exception {
        Assert.assertEquals("1a",convert.toHex(26));
        Assert.assertEquals("ffffffff",convert.toHex(-1));
    }

    @Test
    public void toHex1() throws Exception {
        Assert.assertEquals("1a",convert.toHex1(26));
        Assert.assertEquals("ffffffff",convert.toHex1(-1));
    }

}