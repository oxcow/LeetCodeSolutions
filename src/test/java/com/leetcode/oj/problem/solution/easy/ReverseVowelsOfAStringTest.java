package com.leetcode.oj.problem.solution.easy;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wli on 2017-08-31.
 */
public class ReverseVowelsOfAStringTest {
    ReverseVowelsOfAString reverseVowels = null;

    @Before
    public void setUp() throws Exception {
        reverseVowels = new ReverseVowelsOfAString();
    }

    @After
    public void tearDown() throws Exception {
        reverseVowels = null;
    }

    @Test
    public void reverseVowels() throws Exception {
        Assert.assertNull(reverseVowels.reverseVowels(null));
        Assert.assertEquals("e", reverseVowels.reverseVowels("e"));
        Assert.assertEquals("eto", reverseVowels.reverseVowels("ote"));
        Assert.assertEquals("holle", reverseVowels.reverseVowels("hello"));
        Assert.assertEquals("leotcede", reverseVowels.reverseVowels("leetcode"));
        Assert.assertEquals("leetcode", reverseVowels.reverseVowels("leotcede"));

    }

}