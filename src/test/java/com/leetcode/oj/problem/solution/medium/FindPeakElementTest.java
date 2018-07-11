package com.leetcode.oj.problem.solution.medium;

import junit.framework.Assert;
import org.junit.Test;

public class FindPeakElementTest {

    @Test
    public void findPeakElement() {
        FindPeakElement find = new FindPeakElement();
        Assert.assertEquals(0, find.findPeakElement(new int[]{1}));
        Assert.assertEquals(0, find.findPeakElement(new int[]{3, 2, 1}));
        Assert.assertEquals(2, find.findPeakElement(new int[]{1, 2, 3, 1}));
        Assert.assertEquals(1, find.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }
}