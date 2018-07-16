package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class RotateStringTest {

    @Test
    public void rotateString() {
        RotateString rotate = new RotateString();

        Assert.assertTrue(rotate.rotateString("a", "a"));
        Assert.assertFalse(rotate.rotateString("a", "b"));
        Assert.assertTrue(rotate.rotateString("abcde", "cdeab"));
        Assert.assertFalse(rotate.rotateString("abcde", "abced"));

        Assert.assertFalse(rotate.rotateString("ohbrwzxvxe", "uornhegseo"));

        Assert.assertTrue(rotate.rotateString("aoo", "ooa"));

        Assert.assertTrue(rotate.rotateString("vcuszhlbtpmksjleuchmjffufrwpiddgyynfujnqblngzoogzg", "fufrwpiddgyynfujnqblngzoogzgvcuszhlbtpmksjleuchmjf"));

    }


    @Test
    public void rotateStringByShortCode() {
        RotateString rotate = new RotateString();

        Assert.assertTrue(rotate.rotateStringByShortCode("a", "a"));
        Assert.assertFalse(rotate.rotateStringByShortCode("a", "b"));
        Assert.assertTrue(rotate.rotateStringByShortCode("abcde", "cdeab"));
        Assert.assertFalse(rotate.rotateStringByShortCode("abcde", "abced"));

        Assert.assertFalse(rotate.rotateStringByShortCode("ohbrwzxvxe", "uornhegseo"));

        Assert.assertTrue(rotate.rotateStringByShortCode("aoo", "ooa"));

        Assert.assertTrue(rotate.rotateStringByShortCode("vcuszhlbtpmksjleuchmjffufrwpiddgyynfujnqblngzoogzg", "fufrwpiddgyynfujnqblngzoogzgvcuszhlbtpmksjleuchmjf"));

    }
}