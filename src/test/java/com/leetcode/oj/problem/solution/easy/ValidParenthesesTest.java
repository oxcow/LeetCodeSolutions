package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    @Test
    public void testIsValid() throws Exception {
        Assert.assertFalse(ValidParentheses.isValid(null));
        Assert.assertFalse(ValidParentheses.isValid("   "));
        Assert.assertFalse(ValidParentheses.isValid(" [ "));
        Assert.assertFalse(ValidParentheses.isValid(" ] "));
        Assert.assertFalse(ValidParentheses.isValid(" [} "));
        Assert.assertFalse(ValidParentheses.isValid(" )( "));
        Assert.assertTrue(ValidParentheses.isValid("()"));
        Assert.assertTrue(ValidParentheses.isValid("(){ } ( )"));
        Assert.assertTrue(ValidParentheses.isValid("( [ { } ] )"));
    }
}