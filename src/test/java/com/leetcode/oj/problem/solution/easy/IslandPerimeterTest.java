package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/4/1.
 */
public class IslandPerimeterTest {
    @Test
    public void islandPerimeter() throws Exception {
        IslandPerimeter perimeter = new IslandPerimeter();

        Assert.assertEquals(4
                , perimeter.islandPerimeter(new int[][]{{1, 0}}));

        Assert.assertEquals(16
                , perimeter.islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));
    }

}