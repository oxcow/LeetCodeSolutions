package com.leetcode.oj.problem.solution.medium;

import com.leetcode.oj.problem.solution.easy.RomanToInteger;
import junit.framework.Assert;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testIntToRoman() throws Exception {
        Assert.assertEquals("I", IntegerToRoman.intToRoman(1));
        Assert.assertEquals("II", IntegerToRoman.intToRoman(2));
        Assert.assertEquals("III", IntegerToRoman.intToRoman(3));
        Assert.assertEquals("IV", IntegerToRoman.intToRoman(4));
        Assert.assertEquals("V", IntegerToRoman.intToRoman(5));
        Assert.assertEquals("VI", IntegerToRoman.intToRoman(6));
        Assert.assertEquals("VII", IntegerToRoman.intToRoman(7));
        Assert.assertEquals("VIII", IntegerToRoman.intToRoman(8));
        Assert.assertEquals("IX", IntegerToRoman.intToRoman(9));
        Assert.assertEquals("X", IntegerToRoman.intToRoman(10));
        Assert.assertEquals("XIX", IntegerToRoman.intToRoman(19));
        Assert.assertEquals("XX", IntegerToRoman.intToRoman(20));
        Assert.assertEquals("XL", IntegerToRoman.intToRoman(40));
        Assert.assertEquals("L", IntegerToRoman.intToRoman(50));
        Assert.assertEquals("XC", IntegerToRoman.intToRoman(90));
        Assert.assertEquals("MDCCCXCIX", IntegerToRoman.intToRoman(1899));
        Assert.assertEquals("MMMCMXCIX", IntegerToRoman.intToRoman(3999));

        for (int i = 1; i < 4000; i++) {
            String roman = IntegerToRoman.intToRoman(i);
            System.out.println(i + " = " + roman);
            Assert.assertEquals(RomanToInteger.romanToInt(roman), i);
        }
    }
}