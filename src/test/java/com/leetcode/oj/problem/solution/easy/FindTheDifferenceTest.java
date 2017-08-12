package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/8/12.
 */
public class FindTheDifferenceTest {
    @Test
    public void findTheDifference() throws Exception {
        FindTheDifference fd = new FindTheDifference();

        Assert.assertEquals('a', fd.findTheDifference("a", "aa"));

        Assert.assertEquals('a', fd.findTheDifference("", "a"));
        Assert.assertEquals('e', fd.findTheDifference("abc", "bace"));
    }

}