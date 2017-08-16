package com.leetcode.oj.problem.solution.easy;

import com.google.common.io.CharStreams;

import java.util.Arrays;

/**
 * URL: <a href="https://leetcode.com/problems/judge-route-circle/description/">Judge Route Circle</a>
 * <p>
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.
 * <p>
 * The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.
 * <p>
 * Example 1:
 * Input: "UD"
 * Output: true
 * Example 2:
 * Input: "LL"
 * Output: false
 * <p>
 * Created by wli on 2017-08-16.
 */
public class JudgeRouteCircle {

    public boolean judgeCircle(String moves) {

        if (moves == null || moves.trim() == "") return true;

        int x = 0, y = 0;

        for (char direct : moves.toUpperCase().toCharArray()) {
            switch (direct) {
                case 'U':
                    --y;
                    break;
                case 'D':
                    ++y;
                    break;
                case 'L':
                    --x;
                    break;
                case 'R':
                    ++x;
                    break;
            }
        }
        return x == 0 && x == y ? true : false;
    }
}
