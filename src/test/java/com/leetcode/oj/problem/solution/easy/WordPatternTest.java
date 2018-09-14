package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class WordPatternTest {

    @Test
    public void wordPattern() {
        WordPattern pattern = new WordPattern();
        Assert.assertTrue(pattern.wordPattern("abba", "dog cat cat dog"));
        Assert.assertFalse(pattern.wordPattern("abba", "dog cat cat fish"));
        Assert.assertFalse(pattern.wordPattern("aaaa", "dog cat cat dog"));
        Assert.assertFalse(pattern.wordPattern("abba", "dog dog dog dog"));
    }
}