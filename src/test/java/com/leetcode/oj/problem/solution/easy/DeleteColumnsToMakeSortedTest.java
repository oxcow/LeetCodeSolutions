package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class DeleteColumnsToMakeSortedTest {

    @Test
    public void minDeletionSize() {
        DeleteColumnsToMakeSorted sorted = new DeleteColumnsToMakeSorted();

        Assert.assertEquals(0, sorted.minDeletionSize(new String[]{"a", "b"}));
        Assert.assertEquals(1, sorted.minDeletionSize(new String[]{"cba", "daf", "ghi"}));
        Assert.assertEquals(2, sorted.minDeletionSize(new String[]{"rrjk", "furt", "guzm"}));
        Assert.assertEquals(3, sorted.minDeletionSize(new String[]{"zyx", "wvu", "tsr"}));
    }
}