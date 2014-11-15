package com.leetcode.oj.problem.solution.medium;

import junit.framework.Assert;
import org.junit.Test;

public class ReverseWordsInAStringTest {
    @Test
    public void testReverseWords() throws Exception {
        Assert.assertEquals(null, ReverseWordsInAString.reverseWords(null));
        Assert.assertEquals("", ReverseWordsInAString.reverseWords(""));
        Assert.assertEquals("", ReverseWordsInAString.reverseWords(" "));
        Assert.assertEquals("a", ReverseWordsInAString.reverseWords("a"));
        Assert.assertEquals("a", ReverseWordsInAString.reverseWords(" a  "));
        Assert.assertEquals("string;", ReverseWordsInAString.reverseWords("   string;"));
        Assert.assertEquals("blue is sky the.", ReverseWordsInAString.reverseWords("the. sky is blue"));
        Assert.assertEquals("blue is sky the", ReverseWordsInAString.reverseWords("the  sky         is      blue"));
        Assert.assertEquals("blue is sky the", ReverseWordsInAString.reverseWords("the sky is blue    "));
        Assert.assertEquals("blue is sky the", ReverseWordsInAString.reverseWords("      the sky is blue"));
        Assert.assertEquals("blue is sky the", ReverseWordsInAString.reverseWords(" the sky is blue    "));
    }

    @Test
    public void testReverseWords1() throws Exception {
        Assert.assertEquals(null, ReverseWordsInAString.reverseWords1(null));
        Assert.assertEquals("", ReverseWordsInAString.reverseWords1(""));
        Assert.assertEquals(" ", ReverseWordsInAString.reverseWords1(" "));
        Assert.assertEquals("a", ReverseWordsInAString.reverseWords1("a"));
        Assert.assertEquals(" a  ", ReverseWordsInAString.reverseWords1(" a  "));
        Assert.assertEquals("   string;", ReverseWordsInAString.reverseWords1("   string;"));
        Assert.assertEquals("blue is sky the.", ReverseWordsInAString.reverseWords1("the. sky is blue"));
        Assert.assertEquals("blue is sky the", ReverseWordsInAString.reverseWords1("the  sky         is      blue"));
        Assert.assertEquals("blue is sky the    ", ReverseWordsInAString.reverseWords1("the sky is blue    "));
        Assert.assertEquals("      blue is sky the", ReverseWordsInAString.reverseWords1("      the sky is blue"));
        Assert.assertEquals(" blue is sky the    ", ReverseWordsInAString.reverseWords1(" the sky is blue    "));
    }
}