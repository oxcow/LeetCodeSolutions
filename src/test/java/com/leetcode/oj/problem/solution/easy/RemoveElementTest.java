package com.leetcode.oj.problem.solution.easy;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wli on 2017-08-29.
 */
public class RemoveElementTest {
    RemoveElement removeElement = null;

    @Before
    public void setUp() throws Exception {
        removeElement = new RemoveElement();
    }

    @After
    public void tearDown() throws Exception {
        removeElement = null;
    }

    @Test
    public void removeElement() throws Exception {

        int nums[] = new int[]{3, 3, 2, 2};
        int len = removeElement.removeElement(nums, 3);
        Assert.assertEquals(2, len);
        Assert.assertArrayEquals(new int[]{2, 2, 3, 3}, nums);

        nums = new int[]{2, 3, 3, 3};
        len = removeElement.removeElement(nums, 3);
        Assert.assertEquals(1, len);
        Assert.assertArrayEquals(new int[]{2, 3, 3, 3}, nums);
    }

}