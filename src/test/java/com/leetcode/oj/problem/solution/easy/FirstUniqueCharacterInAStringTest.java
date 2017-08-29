package com.leetcode.oj.problem.solution.easy;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstUniqueCharacterInAStringTest {
    FirstUniqueCharacterInAString uniq = null;

    @Before
    public void setUp() throws Exception {
        uniq = new FirstUniqueCharacterInAString();
    }

    @After
    public void tearDown() throws Exception {
        uniq = null;
    }

    @Test
    public void firstUniqChar() throws Exception {
        Assert.assertEquals(-1, uniq.firstUniqChar(null));
        Assert.assertEquals(-1, uniq.firstUniqChar(""));
        Assert.assertEquals(-1, uniq.firstUniqChar("cc"));
        Assert.assertEquals(-1, uniq.firstUniqChar("aadadaad"));
        Assert.assertEquals(-1, uniq.firstUniqChar("leetleet"));
        Assert.assertEquals(0, uniq.firstUniqChar("leetcode"));
        Assert.assertEquals(2, uniq.firstUniqChar("loveleetcode"));
    }

}