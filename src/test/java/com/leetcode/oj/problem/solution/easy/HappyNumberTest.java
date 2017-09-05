package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leeyee on 2017/9/5 21:09.
 */
public class HappyNumberTest {
    @Test
    public void isHappy() throws Exception {
        HappyNumber happyNumber = new HappyNumber();
        Assert.assertFalse(happyNumber.isHappy(9));
        Assert.assertTrue(happyNumber.isHappy(7));
        Assert.assertTrue(happyNumber.isHappy(10));
        Assert.assertFalse(happyNumber.isHappy(15));
        Assert.assertFalse(happyNumber.isHappy(11));
        Assert.assertTrue(happyNumber.isHappy(19));
        Assert.assertFalse(happyNumber.isHappy(23422));
    }

}