package com.leetcode.oj.problem.solution.medium;

import org.junit.Assert;
import org.junit.Test;

public class TopKFrequentElementsTest {

    @Test
    public void topKFrequent() {

        TopKFrequentElements topK = new TopKFrequentElements();

        Assert.assertArrayEquals(new Integer[]{1, 2}
                , topK.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2).toArray());

        Assert.assertArrayEquals(new Integer[]{1}
                , topK.topKFrequent(new int[]{1}, 1).toArray());

    }
}