package com.leetcode.oj.problem.solution.easy;

import org.junit.Test;

/**
 * Created by leeyee.li on 2017/1/18.
 */
public class MoveZeroesTest {

    @Test
    public void testMoveZeroes() throws Exception {
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(new int[]{4, 5, 0, 13, 29, 43, 0, 12, 0, 1, 0, 8, 0, 7, 0, 1, 3});
        System.out.println("--------------------------");
        moveZeroes.moveZeroes(new int[]{0, 0, 0, 0, 0, 0, 0, 3});
        System.out.println("--------------------------");
        moveZeroes.moveZeroes(new int[]{3, 0, 0, 0, 0, 0, 0, 0});
    }
}