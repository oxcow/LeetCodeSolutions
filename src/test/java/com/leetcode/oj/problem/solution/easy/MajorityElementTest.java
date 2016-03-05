package com.leetcode.oj.problem.solution.easy;

import com.google.common.collect.Lists;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MajorityElementTest {
    MajorityElement majorityElement;
    List<TestCase> testCases = null;

    @Before
    public void setUp() throws Exception {
        majorityElement = new MajorityElement();
        testCases = Lists.newArrayList();

        testCases.add(new TestCase(1, new int[]{1}));
        testCases.add(new TestCase(2, new int[]{2, 2}));
        testCases.add(new TestCase(Integer.MIN_VALUE, new int[]{1, 2}));
        testCases.add(new TestCase(Integer.MIN_VALUE, new int[]{1, 2, 3}));
        testCases.add(new TestCase(9, new int[]{1, 9, 9}));

        testCases.add(new TestCase(Integer.MIN_VALUE, new int[]{1, 1, 1, 3, 3, 2}));
        testCases.add(new TestCase(1, new int[]{1, 1, 3, 0, 4, 1, 1}));
    }

    @After
    public void tearDown() throws Exception {
        majorityElement = null;
        testCases = null;
    }

    @Test
    public void testMajorityElement() throws Exception {
        for (TestCase testCase : testCases) {
            Assert.assertEquals(testCase.result, majorityElement.majorityElement(testCase.nums));
        }
    }

    class TestCase {
        int result;
        int[] nums;

        public TestCase(int result, int[] nums) {
            this.result = result;
            this.nums = nums;
        }
    }
}