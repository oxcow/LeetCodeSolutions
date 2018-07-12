package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

public class BaseballGameTest {

    @Test
    public void calPoints() {
        BaseballGame game = new BaseballGame();

        String ops[] = {"5", "-2", "4", "C", "D", "9", "+", "3", "C", "+"};
        Assert.assertEquals(27, game.calPoints(ops));

        ops = new String[]{"5", "2", "C", "D", "+"};
        Assert.assertEquals(30, game.calPoints(ops));

    }
}