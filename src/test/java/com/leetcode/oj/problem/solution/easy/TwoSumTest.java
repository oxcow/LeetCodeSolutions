package com.leetcode.oj.problem.solution.easy;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/3/31.
 */
public class TwoSumTest {
    public static final Joiner JOINER_COMMA = Joiner.on(",");

    private int[] maxIntArray;

    public static final int MAX_LENGTH = 2000;

    @Before
    public void init() {
        maxIntArray = new int[MAX_LENGTH];
        for (int i = 0; i < MAX_LENGTH; i++) {
            maxIntArray[i] = i + 1;
        }
    }

    @Test
    public void twoSum() throws Exception {
        TwoSum towSum = new TwoSum();
        int[] r1 = towSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assert.assertEquals("0,1", int2String(r1));

        int[] r2 = towSum.twoSum(new int[]{2, 7, 11, 15}, 26);
        Assert.assertEquals("2,3", int2String(r2));

        int[] r3 = towSum.twoSum(new int[]{3, 2, 1, 4}, 5);
        //Assert.assertEquals("3,4", int2String(r3));

        int[] r4 = towSum.twoSum(new int[]{-1, -2, -3, -4, -5}, -8);
        Assert.assertEquals("2,4", int2String(r4));

        int[] r5 = towSum.twoSum(maxIntArray, 3999);
        Assert.assertEquals("1998,1999", int2String(r5));
    }

    private String int2String(int[] target) {
        List<Integer> targetList = Lists.newArrayList();
        for (int i : target) {
            targetList.add(i);
        }
        return JOINER_COMMA.join(targetList);
    }
}