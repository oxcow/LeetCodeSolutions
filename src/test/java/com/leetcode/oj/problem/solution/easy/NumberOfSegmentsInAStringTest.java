package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by wli on 2017-09-04.
 */
public class NumberOfSegmentsInAStringTest {

    NumberOfSegmentsInAString nosias = new NumberOfSegmentsInAString();

    @Test
    public void countSegments() throws Exception {
        Assert.assertEquals(0, nosias.countSegments(null));
        Assert.assertEquals(0, nosias.countSegments(""));
        Assert.assertEquals(0, nosias.countSegments(" "));
        Assert.assertEquals(0, nosias.countSegments("  "));
        Assert.assertEquals(5, nosias.countSegments("Hello, my name is John"));
        Assert.assertEquals(5, nosias.countSegments("    Hello, my name is John"));
        Assert.assertEquals(5, nosias.countSegments("Hello, my name is John    "));
        Assert.assertEquals(5, nosias.countSegments("Hello, my     name is John"));
    }

}