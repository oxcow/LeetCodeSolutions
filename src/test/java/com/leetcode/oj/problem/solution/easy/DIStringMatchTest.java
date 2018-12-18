package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class DIStringMatchTest {

    @Test
    public void diStringMatch() {
        DIStringMatch match = new DIStringMatch();
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3}, match.diStringMatch("III"));
        Assert.assertArrayEquals(new int[]{3, 2, 0, 1}, match.diStringMatch("DDI"));
        Assert.assertArrayEquals(new int[]{0, 4, 1, 3, 2}, match.diStringMatch("IDID"));
    }
}