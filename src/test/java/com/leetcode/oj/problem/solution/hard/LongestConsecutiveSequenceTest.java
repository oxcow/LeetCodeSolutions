package com.leetcode.oj.problem.solution.hard;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wli on 2017-08-22.
 */
public class LongestConsecutiveSequenceTest {

    @Test
    public void longestConsecutive() throws Exception {
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();

        Assert.assertEquals(1, lcs.longestConsecutive(new int[]{1}));
        Assert.assertEquals(1, lcs.longestConsecutive(new int[]{1, 1}));
        Assert.assertEquals(3, lcs.longestConsecutive(new int[]{2, 1, 3}));
        Assert.assertEquals(4, lcs.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        Assert.assertEquals(3, lcs.longestConsecutive(new int[]{1, 2, 0, 1}));
        Assert.assertEquals(7, lcs.longestConsecutive(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6}));
    }

    @Test
    public void longestConsecutiveNotSort() throws Exception {
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();

        Assert.assertEquals(1, lcs.longestConsecutiveNotSort(new int[]{1}));
        Assert.assertEquals(1, lcs.longestConsecutiveNotSort(new int[]{1, 1}));
        Assert.assertEquals(3, lcs.longestConsecutiveNotSort(new int[]{2, 1, 3}));
        Assert.assertEquals(4, lcs.longestConsecutiveNotSort(new int[]{100, 4, 200, 1, 3, 2}));
        Assert.assertEquals(3, lcs.longestConsecutiveNotSort(new int[]{1, 2, 0, 1}));
        Assert.assertEquals(7, lcs.longestConsecutiveNotSort(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6}));
    }

    @Test
    public void restrictedMethod() throws Exception {
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();

        // Assert.assertEquals(1, lcs.restrictedMethod(new int[]{Integer.MAX_VALUE})); // java.lang.NegativeArraySizeException
        Assert.assertEquals(1, lcs.restrictedMethod(new int[]{1}));
        Assert.assertEquals(1, lcs.restrictedMethod(new int[]{1, 1}));
        Assert.assertEquals(3, lcs.restrictedMethod(new int[]{2, 1, 3}));
        Assert.assertEquals(4, lcs.restrictedMethod(new int[]{100, 4, 200, 1, 3, 2}));
        Assert.assertEquals(3, lcs.restrictedMethod(new int[]{1, 2, 0, 1}));
        Assert.assertEquals(7, lcs.restrictedMethod(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6}));
    }
}