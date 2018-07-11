package com.leetcode.oj.problem.solution.medium;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FindPeakElementTest {

    int MAX_LEN = 100_000;
    int[] LONG_INTS_SORTED_ASC = new int[MAX_LEN];

    @Before
    public void init() {
        for (int i = 0; i < MAX_LEN; i++) {
            LONG_INTS_SORTED_ASC[i] = i;
        }
    }

    @After
    public void destroy() {
        LONG_INTS_SORTED_ASC = null;
    }

    @Test
    public void findPeakElement() {
        FindPeakElement find = new FindPeakElement();
        Assert.assertEquals(0, find.findPeakElement(new int[]{1}));
        Assert.assertEquals(0, find.findPeakElement(new int[]{3, 2, 1}));
        Assert.assertEquals(2, find.findPeakElement(new int[]{1, 2, 3, 1}));
        Assert.assertEquals(1, find.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));

    }

    @Test
    public void testLongInputIsSortedByASC() {
        FindPeakElement find = new FindPeakElement();
        Assert.assertEquals(MAX_LEN - 1, find.findPeakElement(LONG_INTS_SORTED_ASC));
    }
}