package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by wli on 2017-11-07.
 */
public class ImplementStrStrTest {
    @Test
    public void strStr() throws Exception {
        ImplementStrStr strStr = new ImplementStrStr();
        Assert.assertEquals(-1, strStr.strStr("acc", "fgsgf"));
        Assert.assertEquals(-1, strStr.strStr("aaaaa", "bba"));
        Assert.assertEquals(0, strStr.strStr("hello", "hello"));
        Assert.assertEquals(2, strStr.strStr("hello", "ll"));
    }

}