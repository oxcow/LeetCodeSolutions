package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfLinesToWriteStringTest {

    @Test
    public void numberOfLines() {
        NumberOfLinesToWriteString writeString = new NumberOfLinesToWriteString();

        String s = "abcdefghijklmnopqrstuvwxyz";
        int[] widths = {2, 10, 10, 10, 10, 10, 5, 10, 10, 10, 4, 10, 8, 10, 10, 10, 10, 1, 10, 10, 10, 10, 6, 10, 2, 10};
        Assert.assertArrayEquals(new int[]{3, 28}, writeString.numberOfLines(widths, s));

        widths = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        Assert.assertArrayEquals(new int[]{3, 60}, writeString.numberOfLines(widths, s));

        widths = new int[]{4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        s = "bbbcccdddaaa";
        Assert.assertArrayEquals(new int[]{2, 4}, writeString.numberOfLines(widths, s));

    }
}