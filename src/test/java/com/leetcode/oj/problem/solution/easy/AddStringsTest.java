package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leeyee on 2017/09/05.
 */
public class AddStringsTest {
    @Test
    public void addStrings() throws Exception {
        AddStrings add = new AddStrings();
        Assert.assertEquals("413", add.addStrings("408", "5"));
        Assert.assertEquals("10", add.addStrings("7", "3"));
        Assert.assertEquals("30", add.addStrings("10", "20"));
        Assert.assertEquals((1111 + 99999999) + "", add.addStrings("1111", "99999999"));
        Assert.assertEquals("2222222222222222222222222222222222222222222222222222222222222222222222222"
                , add.addStrings("1111111111111111111111111111111111111111111111111111111111111111111111111"
                        , "1111111111111111111111111111111111111111111111111111111111111111111111111"));
        Assert.assertEquals("19999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999998"
                , add.addStrings("9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"
                        , "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"));
    }

}