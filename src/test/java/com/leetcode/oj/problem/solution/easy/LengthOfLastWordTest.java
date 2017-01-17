package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by leeyee.li on 2017/1/17.
 */
public class LengthOfLastWordTest {

    @Test
    public void testLengthOfLastWord() throws Exception {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        Assert.assertEquals(1, lengthOfLastWord.lengthOfLastWord(" a "));
        Assert.assertEquals(1, lengthOfLastWord.lengthOfLastWord(" a"));
        Assert.assertEquals(1, lengthOfLastWord.lengthOfLastWord("a "));
        Assert.assertEquals(5, lengthOfLastWord.lengthOfLastWord("hello world "));
        Assert.assertEquals(5, lengthOfLastWord.lengthOfLastWord("hello world"));
    }
}