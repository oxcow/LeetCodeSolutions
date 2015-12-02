package com.leetcode.oj.problem.solution.medium;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;

public class AddTowNumbersTest {
    private static final Logger logger = LoggerFactory.getLogger(AddTowNumbers.class);
    AddTowNumbers addTowNumbers;

    @Before
    public void init() {
        addTowNumbers = new AddTowNumbers();
    }

    @After
    public void destroy() {
        addTowNumbers = null;
    }

    @Test
    public void testGetNodeList() throws Exception {
        AddTowNumbers.ListNode listNode = construct(new Integer[]{1, 2, 3});

        logger.info("{}", addTowNumbers.getNodeList(listNode, new ArrayList<Integer>()));
    }

    @Test
    public void testConstructListNode() throws Exception {
        AddTowNumbers.ListNode listNode = null;
        for (Integer integer : Arrays.asList(new Integer[]{11, 2, 3})) {
            listNode = addTowNumbers.constructListNode(integer, listNode);
        }
        logger.info("{}", listNode);
    }

    private AddTowNumbers.ListNode construct(Integer[] arr) {
        AddTowNumbers.ListNode listNode = null;
        for (Integer integer : Arrays.asList(arr)) {
            listNode = addTowNumbers.constructListNode(integer, listNode);
        }
        return listNode;
    }

    @Test
    public void testAddTwoNumbers() throws Exception {

        Assert.assertEquals("{1,8}", addTowNumbers.addTwoNumbers(construct(new Integer[]{0}), construct(new Integer[]{1, 8})).toString());

        Assert.assertEquals("{1,8}", addTowNumbers.addTwoNumbers(construct(new Integer[]{1, 8}), construct(new Integer[]{0})).toString());

        Assert.assertEquals("{7,0,8}", addTowNumbers.addTwoNumbers(construct(new Integer[]{2, 4, 3}), construct(new Integer[]{5, 6, 4})).toString());

        Assert.assertEquals("{2,2,4}", addTowNumbers.addTwoNumbers(construct(new Integer[]{1, 0, 1}), construct(new Integer[]{1, 2, 3})).toString());

        Assert.assertEquals("{8,9,9,1}", addTowNumbers.addTwoNumbers(construct(new Integer[]{9, 9, 9}), construct(new Integer[]{9, 9, 9})).toString());

        int maxLen = 10000;
        Integer integer[] = new Integer[maxLen];
        for (int i = 0; i < maxLen; i++) {
            integer[i] = i + 1;
        }
        AddTowNumbers.ListNode bigListNode = construct(integer);
        Assert.assertEquals("{2,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,4,6,8,0,3,5,7,9,1,222}", addTowNumbers.addTwoNumbers(bigListNode, bigListNode).toString());
    }
}