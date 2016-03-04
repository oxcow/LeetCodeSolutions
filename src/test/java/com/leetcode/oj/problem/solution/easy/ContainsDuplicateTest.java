package com.leetcode.oj.problem.solution.easy;

import com.google.common.collect.Lists;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    ContainsDuplicate containsDuplicate = null;

    List<TestCase> testCases = null;

    @Before
    public void setUp() throws Exception {
        containsDuplicate = new ContainsDuplicate();
        testCases = Lists.newArrayList();

        testCases.add(new TestCase(false, new int[]{1, 2}));
        testCases.add(new TestCase(false, new int[]{1, 2, 3}));
        testCases.add(new TestCase(true, new int[]{1, 9, 9}));
        int[] testLong = new int[10001];
        for (int i = 0; i < 10000; i++) {
            testLong[i] = i;
        }
        testLong[10000] = 9999;
        testCases.add(new TestCase(true, testLong));
        testCases.add(new TestCase(true, new int[]{1, 1, 1, 3, 3, 2}));
        testCases.add(new TestCase(true, new int[]{1, 2, 3, 0, 4, 1, 1}));


        testCases.add(new TestCase(false, new int[]{1}));
    }

    @After
    public void tearDown() throws Exception {
        containsDuplicate = null;
        testCases = null;
    }

    @Test
    public void testContainsDuplicate() throws Exception {
        for (TestCase testCase : testCases) {
            System.out.println(testCase.result + " : " + testCase.nums);
            Assert.assertEquals(testCase.result, containsDuplicate.containsDuplicate(testCase.nums));
        }
    }

    class TestCase {
        boolean result;
        int[] nums;

        public TestCase(boolean result, int[] nums) {
            this.result = result;
            this.nums = nums;
        }
    }
}