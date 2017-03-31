package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/3/31.
 */
public class NumberComplementTest {
    @Test
    public void findComplement() throws Exception {
        NumberComplement nc = new NumberComplement();
        Assert.assertEquals(2, nc.findComplement(5));
        Assert.assertEquals(0, nc.findComplement(1));
    }

}