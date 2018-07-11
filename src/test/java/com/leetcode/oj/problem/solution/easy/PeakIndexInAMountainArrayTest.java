package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class PeakIndexInAMountainArrayTest {

    @Test
    public void peakIndexInMountainArray() {
        PeakIndexInAMountainArray array = new PeakIndexInAMountainArray();
        Assert.assertEquals(1, array.peakIndexInMountainArray(new int[]{0, 1, 0}));
        Assert.assertEquals(1, array.peakIndexInMountainArray(new int[]{0, 2, 1, 0}));
        Assert.assertEquals(2, array.peakIndexInMountainArray(new int[]{9, 9, 10, 9}));
    }

    @Test
    public void peakIndex() {
        PeakIndexInAMountainArray array = new PeakIndexInAMountainArray();
        Assert.assertEquals(1, array.peakIndex(new int[]{0, 1, 0}));
        Assert.assertEquals(1, array.peakIndex(new int[]{0, 2, 1, 0}));
        Assert.assertEquals(2, array.peakIndex(new int[]{9, 9, 10, 9}));
    }
}