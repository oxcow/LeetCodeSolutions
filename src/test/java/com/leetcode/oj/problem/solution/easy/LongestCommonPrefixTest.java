package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void testLongestCommonPrefix() throws Exception {
        Assert.assertNull(LongestCommonPrefix.longestCommonPrefix(null));
        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{}));
        Assert.assertEquals("a", LongestCommonPrefix.longestCommonPrefix(new String[]{"a"}));
        Assert.assertEquals("a", LongestCommonPrefix.longestCommonPrefix(new String[]{null, "a"}));
        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"", "a"}));
        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"a", "b"}));
        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"ca", "a"}));
        Assert.assertEquals("ab", LongestCommonPrefix.longestCommonPrefix(new String[]{"ab", "abc"}));
        Assert.assertEquals("ab", LongestCommonPrefix.longestCommonPrefix(new String[]{"abc", "abd", "abce"}));
        Assert.assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    public void testLongestCommonPrefixDependList() throws Exception {
        Assert.assertNull(LongestCommonPrefix.longestCommonPrefix(null));
        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefixDependList(new String[]{}));
        Assert.assertEquals("a", LongestCommonPrefix.longestCommonPrefixDependList(new String[]{"a"}));
        Assert.assertEquals("a", LongestCommonPrefix.longestCommonPrefixDependList(new String[]{null, "a"}));
        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefixDependList(new String[]{"", "a"}));
        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefixDependList(new String[]{"a", "b"}));
        Assert.assertEquals("", LongestCommonPrefix.longestCommonPrefixDependList(new String[]{"ca", "a"}));
        Assert.assertEquals("ab", LongestCommonPrefix.longestCommonPrefixDependList(new String[]{"ab", "abc"}));
        Assert.assertEquals("ab", LongestCommonPrefix.longestCommonPrefixDependList(new String[]{"abc", "abd", "abce"}));
        Assert.assertEquals("fl", LongestCommonPrefix.longestCommonPrefixDependList(new String[]{"flower", "flow", "flight"}));
    }
}