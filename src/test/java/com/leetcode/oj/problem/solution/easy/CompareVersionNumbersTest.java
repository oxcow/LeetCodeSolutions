package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompareVersionNumbersTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCompareVersion() throws Exception {
        CompareVersionNumbers compareVersionNumbers = new CompareVersionNumbers();
        Assert.assertEquals(0, compareVersionNumbers.compareVersion("1.0", "1"));
        Assert.assertEquals(0, compareVersionNumbers.compareVersion("1.0", "1.0.0.0"));
        Assert.assertEquals(0, compareVersionNumbers.compareVersion("1.1", "1.1"));
        Assert.assertEquals(-1, compareVersionNumbers.compareVersion("0.1", "1.1"));
        Assert.assertEquals(1, compareVersionNumbers.compareVersion("1.1", "0.1"));
        Assert.assertEquals(-1, compareVersionNumbers.compareVersion("0.1", "0.1.1"));
    }
}