package com.leetcode.oj.problem.solution.medium;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TowSumTest {

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
    public void testTowSum() throws Exception {
        TowSum towSum = new TowSum();
        int[] r1 = towSum.twoSumUseLoop(new int[]{2, 7, 11, 15}, 9);
        Assert.assertEquals("1,2", int2String(r1));

        int[] r2 = towSum.twoSumUseLoop(new int[]{2, 7, 11, 15}, 26);
        Assert.assertEquals("3,4", int2String(r2));

        int[] r3 = towSum.twoSumUseLoop(new int[]{3, 2, 1, 4}, 5);
        // Assert.assertEquals("3,4", int2String(r3));

        int[] r4 = towSum.twoSumUseLoop(new int[]{-1, -2, -3, -4, -5}, -8);
        Assert.assertEquals("3,5", int2String(r4));

        int[] r5 = towSum.twoSumUseLoop(maxIntArray, 3999);
        Assert.assertEquals("1999,2000", int2String(r5));


    }

    @Test
    public void testTowSumUseHashMap() throws Exception {

        TowSum towSum = new TowSum();
        int[] r1 = towSum.towSumUseHashMap(new int[]{2, 7, 11, 15}, 9);
        Assert.assertEquals("1,2", int2String(r1));

        int[] r2 = towSum.towSumUseHashMap(new int[]{2, 7, 11, 15}, 26);
        Assert.assertEquals("3,4", int2String(r2));

        int[] r3 = towSum.towSumUseHashMap(new int[]{3, 2, 1, 4}, 5);
        //Assert.assertEquals("3,4", int2String(r3));

        int[] r4 = towSum.towSumUseHashMap(new int[]{-1, -2, -3, -4, -5}, -8);
        Assert.assertEquals("3,5", int2String(r4));

        int[] r5 = towSum.towSumUseHashMap(maxIntArray, 3999);
        Assert.assertEquals("1999,2000", int2String(r5));
    }

    private String int2String(int[] target) {
        List<Integer> targetList = Lists.newArrayList();
        for (int i : target) {
            targetList.add(i);
        }
        return JOINER_COMMA.join(targetList);
    }

}