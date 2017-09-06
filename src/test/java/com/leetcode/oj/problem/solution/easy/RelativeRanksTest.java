package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leeyee on 2017/9/6 22:16.
 */
public class RelativeRanksTest {
    @Test
    public void findRelativeRanks() throws Exception {
        RelativeRanks ranks = new RelativeRanks();

        Assert.assertArrayEquals(new String[]{"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"}
                , ranks.findRelativeRanks(new int[]{10, 3, 8, 9, 4}));

        Assert.assertArrayEquals(new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"}
                , ranks.findRelativeRanks(new int[]{5, 4, 3, 2, 1}));
    }

}