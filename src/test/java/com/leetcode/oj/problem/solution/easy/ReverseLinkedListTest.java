package com.leetcode.oj.problem.solution.easy;

import com.google.common.base.Stopwatch;
import com.leetcode.oj.problem.solution.medium.AddTowNumbersUseStack;
import junit.framework.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class ReverseLinkedListTest {
    private Logger logger = LoggerFactory.getLogger(ReverseLinkedListTest.class);

    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    private ReverseLinkedList.ListNode construct(Integer[] arr) {


        Stack<Integer> stack = new Stack<>();
        for (Integer integer : Arrays.asList(arr)) {
            stack.push(integer);
        }
        ReverseLinkedList.ListNode listNode = null;
        while (!stack.isEmpty()) {
            int top = stack.pop();
            ReverseLinkedList.ListNode ln = new ReverseLinkedList().new ListNode(top);
            if (listNode != null) {
                ln.next = listNode;
            }
            listNode = ln;
        }
        return listNode;
    }

    @Test
    public void testReverseList() throws Exception {
        Stopwatch stopwatch = Stopwatch.createStarted();

        Assert.assertNull(reverseLinkedList.reverseList(null));
        Assert.assertEquals("{3,2,1}", reverseLinkedList.reverseList(construct(new Integer[]{1, 2, 3})).toString());

        logger.info("testMajorityElementUseMap spend: {}ms", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));

    }
}