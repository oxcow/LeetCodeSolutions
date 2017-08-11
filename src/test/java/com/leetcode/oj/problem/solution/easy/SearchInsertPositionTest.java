package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/8/11.
 */
public class SearchInsertPositionTest {
    @Test
    public void searchInsert() throws Exception {
        SearchInsertPosition sip = new SearchInsertPosition();


        Assert.assertEquals(0, sip.searchInsert(new int[]{}, 5));


        Assert.assertEquals(2, sip.searchInsert(new int[]{1, 3, 5, 6}, 5));

        Assert.assertEquals(1, sip.searchInsert(new int[]{1, 3, 5, 6}, 2));
        Assert.assertEquals(4, sip.searchInsert(new int[]{1, 3, 5, 6}, 7));
        Assert.assertEquals(0, sip.searchInsert(new int[]{1, 3, 5, 6}, 0));

    }

}