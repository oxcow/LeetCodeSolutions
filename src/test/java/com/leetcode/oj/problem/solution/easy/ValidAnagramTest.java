package com.leetcode.oj.problem.solution.easy;

import com.google.common.collect.Lists;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ValidAnagramTest {

    List<TestCase> testCaseList = null;
    ValidAnagram validAnagram = null;

    @Before
    public void init() {
        validAnagram = new ValidAnagram();

        testCaseList = Lists.newArrayList();
        testCaseList.add(new TestCase("ac", "bb", false)); // 当使用char求和时，该case会返回true
        testCaseList.add(new TestCase("ac", "a", false));
        testCaseList.add(new TestCase("aaa", "aaa", true));
        testCaseList.add(new TestCase("anagram", "nagaram", true));
        testCaseList.add(new TestCase("rat", "car", false));
        testCaseList.add(new TestCase("我们", "们我", true));
        testCaseList.add(new TestCase("\\u6211\\u4eec", "\\u6211\\u4eec", true));
    }

    @After
    public void destroy() {
        testCaseList = null;
    }

    @Test
    public void testIsAnagram() throws Exception {
        for (TestCase testCase : testCaseList) {
            Assert.assertEquals(testCase.result, validAnagram.isAnagram(testCase.s, testCase.t));
        }

    }

    class TestCase {
        String s;
        String t;
        boolean result;

        public TestCase(String s, String t, boolean result) {
            this.s = s;
            this.t = t;
            this.result = result;
        }
    }
}