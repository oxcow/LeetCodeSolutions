package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/4/30.
 */
public class ReverseWordsInAStringIIITest {
    @Test
    public void reverseWords() throws Exception {
        ReverseWordsInAStringIII revers = new ReverseWordsInAStringIII();
        Assert.assertEquals("  b ",revers.reverseWords("  b "));
        Assert.assertEquals("ba   cd",revers.reverseWords("ab   dc"));
        Assert.assertEquals("   ba",revers.reverseWords("   ab"));
        Assert.assertEquals("ba",revers.reverseWords("ab"));
        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc",revers.reverseWords("Let's take LeetCode contest"));
    }

}