package com.leetcode.oj.problem.solution.medium;

import com.leetcode.oj.problem.solution.common.StringHelper;
import org.junit.Test;

/**
 * Created by wli on 2017-09-08.
 */
public class ShuffleAnArrayTest {
    @Test
    public void test() throws Exception {
        ShuffleAnArray obj = new ShuffleAnArray(new int[]{1, 2, 3, 4});

        System.out.println(StringHelper.toString(obj.shuffle()));
        System.out.println(StringHelper.toString(obj.reset()));
        System.out.println(StringHelper.toString(obj.shuffle()));
    }
}