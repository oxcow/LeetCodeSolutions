package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinaryTest {

    @Test
    public void testAddBinary() throws Exception {
        AddBinary addBinary = new AddBinary();
        Assert.assertEquals("0", addBinary.addBinary("0", "0"));
        Assert.assertEquals("1", addBinary.addBinary("0", "1"));
        Assert.assertEquals("10", addBinary.addBinary("1", "1"));
        Assert.assertEquals("11", addBinary.addBinary("10", "01"));
        Assert.assertEquals("11", addBinary.addBinary("10", "1"));
        Assert.assertEquals("110", addBinary.addBinary("11", "11"));
        Assert.assertEquals("100", addBinary.addBinary("11", "01"));
        Assert.assertEquals("10101", addBinary.addBinary("1010", "1011"));
        Assert.assertEquals("10000000000000000", addBinary.addBinary("1111111111111111", "1"));
    }
}