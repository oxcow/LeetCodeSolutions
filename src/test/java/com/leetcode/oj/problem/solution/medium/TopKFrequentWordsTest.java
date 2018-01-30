package com.leetcode.oj.problem.solution.medium;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wli on 2018-01-30.
 */
public class TopKFrequentWordsTest {
    @Test
    public void topKFrequent() throws Exception {
        TopKFrequentWords topK = new TopKFrequentWords();

        Assert.assertArrayEquals(Lists.newArrayList("i", "love", "coding").toArray()
                , topK.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 3).toArray());

        Assert.assertArrayEquals(Lists.newArrayList("i", "love").toArray()
                , topK.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2).toArray());

        Assert.assertArrayEquals(Lists.newArrayList("the", "is", "sunny", "day").toArray()
                , topK.topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4).toArray());
    }

    @Test
    public void topKFrequent1() throws Exception {
        TopKFrequentWords topK = new TopKFrequentWords();

        Assert.assertArrayEquals(Lists.newArrayList("i", "love", "coding").toArray()
                , topK.topKFrequent1(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 3).toArray());

        Assert.assertArrayEquals(Lists.newArrayList("i", "love").toArray()
                , topK.topKFrequent1(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2).toArray());

        Assert.assertArrayEquals(Lists.newArrayList("the", "is", "sunny", "day").toArray()
                , topK.topKFrequent1(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4).toArray());
    }

}