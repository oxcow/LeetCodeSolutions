package com.leetcode.oj.problem.solution.easy;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/4/1.
 */
public class FizzBuzzTest {
    @Test
    public void fizzBuzz() throws Exception {
        FizzBuzz fb = new FizzBuzz();
        Assert.assertArrayEquals(Lists.newArrayList("1", "2", "Fizz").toArray(), fb.fizzBuzz(3).toArray());
        Assert.assertArrayEquals(Lists.newArrayList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz"
                , "Buzz", "11", "Fizz", "13", "14", "FizzBuzz").toArray()
                , fb.fizzBuzz(15).toArray());

    }

}