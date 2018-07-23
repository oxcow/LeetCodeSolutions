package com.leetcode.oj.problem.solution.easy;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PositionsOfLargeGroupsTest {

    @Test
    public void largeGroupPositions() {
        PositionsOfLargeGroups groups = new PositionsOfLargeGroups();

        List<List<Integer>> list = Lists.newArrayList();
        list.add(Lists.newArrayList(3, 6));

        Assert.assertArrayEquals(list.toArray(), groups.largeGroupPositions("abbxxxxzzy").toArray());


        list.clear();
        Assert.assertArrayEquals(list.toArray(), groups.largeGroupPositions("abc").toArray());

        list.add(Lists.newArrayList(3, 5));
        list.add(Lists.newArrayList(6, 9));
        list.add(Lists.newArrayList(12, 14));
        Assert.assertArrayEquals(list.toArray(), groups.largeGroupPositions("abcdddeeeeaabbbcd").toArray());
    }
}