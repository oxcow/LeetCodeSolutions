package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    @Test
    public void testIsPalindrome() throws Exception {
        Assert.assertTrue(PalindromeNumber.isPalindrome(11));
        Assert.assertTrue(PalindromeNumber.isPalindrome(121));
        Assert.assertTrue(PalindromeNumber.isPalindrome(123454321));
        Assert.assertFalse(PalindromeNumber.isPalindrome(Integer.MIN_VALUE));
        Assert.assertFalse(PalindromeNumber.isPalindrome(123212));
    }
}