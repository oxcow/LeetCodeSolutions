package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/4/1.
 */
public class DetectCapitalTest {
    @Test
    public void detectCapitalUse() throws Exception {
        DetectCapital detectCapital = new DetectCapital();

        Assert.assertFalse(detectCapital.detectCapitalUse("LgL"));
        Assert.assertTrue(detectCapital.detectCapitalUse("ggg"));
        Assert.assertTrue(detectCapital.detectCapitalUse("g"));
        Assert.assertTrue(detectCapital.detectCapitalUse("USA"));
        Assert.assertFalse(detectCapital.detectCapitalUse("flaG"));
        Assert.assertTrue(detectCapital.detectCapitalUse("Google"));
        Assert.assertFalse(detectCapital.detectCapitalUse("mL"));

    }

}