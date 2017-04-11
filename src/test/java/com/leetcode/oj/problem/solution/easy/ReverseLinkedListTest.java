package com.leetcode.oj.problem.solution.easy;

import com.google.common.base.Stopwatch;
import com.leetcode.oj.problem.solution.common.ListNode;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class ReverseLinkedListTest {
    private Logger logger = LoggerFactory.getLogger(ReverseLinkedListTest.class);

    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    @After
    public void destory() {
        reverseLinkedList = null;
    }

    @Test
    public void testReverseList() throws Exception {
        Stopwatch stopwatch = Stopwatch.createStarted();

        Assert.assertNull(reverseLinkedList.reverseList(null));

        ListNode listNode = ListNode.creator(new Integer[]{1, 2, 3});
        Assert.assertEquals("{3,2,1}", reverseLinkedList.reverseList(listNode).toString());

        logger.info("testMajorityElementUseMap spend: {}ms", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));

    }
}