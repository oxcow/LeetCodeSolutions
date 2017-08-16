package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wli on 2017-08-16.
 */
public class JudgeRouteCircleTest {
    @Test
    public void judgeCircle() throws Exception {
        JudgeRouteCircle jrc = new JudgeRouteCircle();
        Assert.assertTrue(jrc.judgeCircle(null));
        Assert.assertTrue(jrc.judgeCircle(""));
        Assert.assertTrue(jrc.judgeCircle("UD"));
        Assert.assertFalse(jrc.judgeCircle("LL"));
        Assert.assertTrue(jrc.judgeCircle("UUDD"));
        Assert.assertTrue(jrc.judgeCircle("LLLLLDDDDRRRRRUUUU"));
    }

}