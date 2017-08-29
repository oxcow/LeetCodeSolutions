package com.leetcode.oj.problem.solution.easy;

import java.util.ArrayList;
import java.util.List;

public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        List<Integer> sisterCandyNum = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (sisterCandyNum.indexOf(candies[i]) == -1) {
                sisterCandyNum.add(candies[i]);
            }
            if (sisterCandyNum.size() == candies.length / 2) {
                break;
            }
        }
        return sisterCandyNum.size();
    }
}
