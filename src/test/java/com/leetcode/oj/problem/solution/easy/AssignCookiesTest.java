package com.leetcode.oj.problem.solution.easy;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/08/30.
 */
public class AssignCookiesTest {
    AssignCookies cookies = null;

    @Before
    public void setUp() throws Exception {
        cookies = new AssignCookies();
    }

    @After
    public void tearDown() throws Exception {
        cookies = null;
    }

    @Test
    public void findContentChildren() throws Exception {
        Assert.assertEquals(1, cookies.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        Assert.assertEquals(2, cookies.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
        Assert.assertEquals(2, cookies.findContentChildren(new int[]{10, 9, 8, 7}, new int[]{5, 6, 7, 8}));
        Assert.assertEquals(3, cookies.findContentChildren(new int[]{6, 9, 8, 7}, new int[]{5, 7, 6, 8}));
    }

}