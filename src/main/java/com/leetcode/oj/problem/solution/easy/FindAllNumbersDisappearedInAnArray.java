package com.leetcode.oj.problem.solution.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by leeyee on 2017/4/2.
 */
public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> notAppear = new ArrayList<>();

        // 初始大小设置是否合适直接影响HashSet的性能，因为扩容是比较消耗时间的
        Set<Integer> rmDup = new HashSet<>(nums.length / 3);
        // 去重
        for (int num : nums) {
            rmDup.add(num); // O(1)
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!rmDup.contains(i)) // O(1)
                notAppear.add(i);
        }

        return notAppear;
    }
}
