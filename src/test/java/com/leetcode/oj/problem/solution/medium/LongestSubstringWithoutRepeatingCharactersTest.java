package com.leetcode.oj.problem.solution.medium;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wli on 2017-08-08.
 */
public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void lengthOfLongestSubstring() throws Exception {

        LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();

        Assert.assertEquals(15, lswrc.lengthOfLongestSubstring("abcdefghijklmnnmlkjihgfedcbao"));

        Assert.assertEquals(3, lswrc.lengthOfLongestSubstring("dvdf"));

        Assert.assertEquals(2, lswrc.lengthOfLongestSubstring("au"));

        Assert.assertEquals(1, lswrc.lengthOfLongestSubstring("     "));

        Assert.assertEquals(0, lswrc.lengthOfLongestSubstring(null));

        Assert.assertEquals(0, lswrc.lengthOfLongestSubstring(""));

        Assert.assertEquals(1, lswrc.lengthOfLongestSubstring("a"));

        Assert.assertEquals(3, lswrc.lengthOfLongestSubstring("abcabcbb"));

        Assert.assertEquals(1, lswrc.lengthOfLongestSubstring("bbbbbb"));

        Assert.assertEquals(3, lswrc.lengthOfLongestSubstring("pwwkew"));

    }

}