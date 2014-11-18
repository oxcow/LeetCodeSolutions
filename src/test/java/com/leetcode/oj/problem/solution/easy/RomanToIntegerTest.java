package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void testIntVal() throws Exception {
        RomanToInteger romanToInteger = new RomanToInteger();
        for (int i = 0; i < RomanToInteger.BASE_ROMAN.length(); i++) {
            Assert.assertEquals(RomanToInteger.ROMAN_INT[i],
                    romanToInteger.intVal(RomanToInteger.BASE_ROMAN.charAt(i)));
        }
    }

    @Test
    public void testRomanToInt() throws Exception {
        Assert.assertEquals(1, RomanToInteger.romanToInt("I"));
        Assert.assertEquals(2, RomanToInteger.romanToInt("II"));
        Assert.assertEquals(3, RomanToInteger.romanToInt("III"));
        Assert.assertEquals(4, RomanToInteger.romanToInt("IV"));
        Assert.assertEquals(5, RomanToInteger.romanToInt("V"));
        Assert.assertEquals(6, RomanToInteger.romanToInt("VI"));
        Assert.assertEquals(7, RomanToInteger.romanToInt("VII"));
        Assert.assertEquals(8, RomanToInteger.romanToInt("VIII"));
        Assert.assertEquals(9, RomanToInteger.romanToInt("IX"));
        Assert.assertEquals(10, RomanToInteger.romanToInt("X"));
        Assert.assertEquals(20, RomanToInteger.romanToInt("XX"));
        Assert.assertEquals(40, RomanToInteger.romanToInt("XL"));
        Assert.assertEquals(50, RomanToInteger.romanToInt("L"));
        Assert.assertEquals(90, RomanToInteger.romanToInt("XC"));
        Assert.assertEquals(1899, RomanToInteger.romanToInt("MDCCCXCIX"));
        Assert.assertEquals(3999, RomanToInteger.romanToInt("MMMCMXCIX"));

    }
}