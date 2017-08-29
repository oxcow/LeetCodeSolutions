package com.leetcode.oj.problem.solution.easy;

import com.google.common.base.Stopwatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DistributeCandies {
    /**
     * common resolve method.
     * <p>
     * if the candies array too big, then we need too mush additional memory space
     *
     * @param candies
     * @return
     */
    public int distributeCandies(int[] candies) {
        List<Integer> sisterCandyNum = new ArrayList<>(candies.length / 2);
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

    /**
     * sort the candies array firstly. reduce additional memory space.
     *
     * @param candies
     * @return
     */
    public int distributeCandiesByReduceSpace(int[] candies) {
        if (candies.length == 2) return 1;
        Arrays.sort(candies);
        int sisterNum = 1;
        int repeatCandy = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (repeatCandy != candies[i]) {
                repeatCandy = candies[i];
                ++sisterNum;
            }
            if (sisterNum == candies.length / 2) {
                break;
            }
        }
        return sisterNum;
    }
}
