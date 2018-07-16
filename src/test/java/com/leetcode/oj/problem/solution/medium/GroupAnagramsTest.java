package com.leetcode.oj.problem.solution.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GroupAnagramsTest {

    @Test
    public void groupAnagrams() {
        GroupAnagrams anagrams = new GroupAnagrams();
        List<List<String>> lists = anagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        Assert.assertEquals(3, lists.size());
        for (List<String> list : lists) {
            if (list.size() == 3) {
                Assert.assertArrayEquals(list.toArray(), new Object[]{"eat", "tea", "ate"});
            } else if (list.size() == 2) {
                Assert.assertArrayEquals(list.toArray(), new Object[]{"tan", "nat"});
            } else if (list.size() == 1) {
                Assert.assertArrayEquals(list.toArray(), new Object[]{"bat"});
            }
        }
    }
}