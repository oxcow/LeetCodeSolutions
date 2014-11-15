package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeTest {

    @Test
    public void testIsPalindrome() throws Exception {
        Assert.assertFalse(ValidPalindrome.isPalindrome("ab2a"));
        Assert.assertTrue(ValidPalindrome.isPalindrome("."));
        Assert.assertFalse(ValidPalindrome.isPalindrome("1a2"));
        Assert.assertFalse(ValidPalindrome.isPalindrome("race a car"));
        Assert.assertTrue(ValidPalindrome.isPalindrome(",,"));
        Assert.assertTrue(ValidPalindrome.isPalindrome("   "));
        Assert.assertTrue(ValidPalindrome.isPalindrome("a,A"));
        Assert.assertTrue(ValidPalindrome.isPalindrome(" AAAAA   "));
        Assert.assertTrue(ValidPalindrome.isPalindrome("aaaaaa"));
        Assert.assertTrue(ValidPalindrome.isPalindrome("A   a"));
        Assert.assertTrue(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}