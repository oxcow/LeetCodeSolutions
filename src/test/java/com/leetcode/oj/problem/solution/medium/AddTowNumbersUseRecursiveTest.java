package com.leetcode.oj.problem.solution.medium;

import com.leetcode.oj.problem.solution.common.ListNode;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;

public class AddTowNumbersUseRecursiveTest {
    private static final Logger logger = LoggerFactory.getLogger(AddTowNumbersUseRecursive.class);

    AddTowNumbersUseRecursive addTowNumbersUseRecursive;

    @Before
    public void init() {
        addTowNumbersUseRecursive = new AddTowNumbersUseRecursive();
    }

    @After
    public void destroy() {
        addTowNumbersUseRecursive = null;
    }

    @Test
    public void testGetNodeList() throws Exception {
         ListNode listNode = ListNode.creator(new Integer[]{1, 2, 3});

         logger.debug("{}", addTowNumbersUseRecursive.getNodeList(listNode, new ArrayList<>()));
    }

    @Test
    public void testConstructListNode() throws Exception {
        ListNode listNode = null;
        for (Integer integer : Arrays.asList(new Integer[]{11, 2, 3})) {
            listNode = addTowNumbersUseRecursive.constructListNode(integer, listNode);
        }
         logger.debug("{}", listNode);
    }

    private  ListNode construct(Integer[] arr) {
        ListNode listNode = null;
        for (Integer integer : Arrays.asList(arr)) {
            listNode = addTowNumbersUseRecursive.constructListNode(integer, listNode);
        }
        return listNode;
    }

    @Test
    public void testAddTwoNumbers() throws Exception {

        Assert.assertEquals("{1,8}", addTowNumbersUseRecursive.addTwoNumbers(construct(new Integer[]{0}), construct(new Integer[]{1, 8})).toString());

        Assert.assertEquals("{1,8}", addTowNumbersUseRecursive.addTwoNumbers(construct(new Integer[]{1, 8}), construct(new Integer[]{0})).toString());

        Assert.assertEquals("{7,0,8}", addTowNumbersUseRecursive.addTwoNumbers(construct(new Integer[]{2, 4, 3}), construct(new Integer[]{5, 6, 4})).toString());

        Assert.assertEquals("{2,2,4}", addTowNumbersUseRecursive.addTwoNumbers(construct(new Integer[]{1, 0, 1}), construct(new Integer[]{1, 2, 3})).toString());

        Assert.assertEquals("{8,9,9,1}", addTowNumbersUseRecursive.addTwoNumbers(construct(new Integer[]{9, 9, 9}), construct(new Integer[]{9, 9, 9})).toString());

        Assert.assertEquals("{8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,1}",
                addTowNumbersUseRecursive.addTwoNumbers(
                        construct(new Integer[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9}),
                        construct(new Integer[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9})).toString());

        int maxLen = 1000;  // 递归次数太多，导致java.lang.StackOverflowError
        Integer integer[] = new Integer[maxLen];
        for (int i = 0; i < maxLen; i++) {
            integer[i] = i + 1;
        }

        ListNode bigListNode = construct(integer);
        Assert.assertEquals("{2,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,222}", addTowNumbersUseRecursive.addTwoNumbers(bigListNode, bigListNode).toString());
    }
}