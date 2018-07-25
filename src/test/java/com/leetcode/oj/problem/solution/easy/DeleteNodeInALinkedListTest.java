package com.leetcode.oj.problem.solution.easy;

import com.leetcode.oj.problem.solution.common.ListNode;
import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteNodeInALinkedListTest {

    @Test
    public void deleteNode() {

        ListNode root = new ListNode(4);
        ListNode two = new ListNode(5);
        ListNode three = new ListNode(1);
        ListNode four = new ListNode(9);
        ListNode five = new ListNode(8);
        root.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        DeleteNodeInALinkedList linkedList = new DeleteNodeInALinkedList();

        linkedList.deleteNode(two);

        Assert.assertEquals("{4,1,9,8}", root.toString());

    }
}