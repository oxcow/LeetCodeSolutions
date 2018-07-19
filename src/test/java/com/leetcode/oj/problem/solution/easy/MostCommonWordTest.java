package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class MostCommonWordTest {

    @Test
    public void mostCommonWord() {
        MostCommonWord word = new MostCommonWord();

        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        Assert.assertEquals("ball", word.mostCommonWord(paragraph, banned));


        Assert.assertEquals("bob", word.mostCommonWord("Bob", new String[]{}));
    }
}