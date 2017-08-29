package com.leetcode.oj.problem.solution.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * URL: <a href="https://leetcode.com/problems/distribute-candies/description/">Distribute Candies</a>
 * <p>
 * Given an integer array with even length, where different numbers in this array represent different kinds of candies. Each number means one candy of the corresponding kind. You need to distribute these candies equally in number to brother and sister. Return the maximum number of kinds of candies the sister could gain.
 * <p>
 * Example 1:
 * Input: candies = [1,1,2,2,3,3]
 * Output: 3
 * Explanation:
 * There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
 * Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too.
 * The sister has three different kinds of candies.
 * Example 2:
 * Input: candies = [1,1,2,3]
 * Output: 2
 * Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1].
 * The sister has two different kinds of candies, the brother has only one kind of candies.
 * Note:
 * <p>
 * The length of the given array is in range [2, 10,000], and will be even.
 * The number in given array is in range [-100,000, 100,000].
 */
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
