package com.leetcode.oj.problem.solution.easy;

import java.util.Arrays;

/**
 * Created by leeyee on 2017/08/30.
 */
public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int num = 0;
        int j = 0;
        for (int i = 0; i < g.length; i++) {
            while (j < s.length) {
                if (s[j++] >= g[i]) {
                    ++num;
                    break;
                }
            }
        }
        return num;
    }
}