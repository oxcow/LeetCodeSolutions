package com.leetcode.oj.problem.solution.medium;

import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * URL: <a href="https://leetcode.com/problems/add-two-numbers/">Add Two Numbers</a>
 * <p/>
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p/>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * <p/>
 * Created by leeyee.li on 2015/12/1.
 */
public class AddTowNumbers {
    private static final Logger logger = LoggerFactory.getLogger(AddTowNumbers.class);

    public List<Integer> getNodeList(ListNode listNode, List<Integer> list) {
        if (listNode != null) {
            list.add(listNode.val);
            getNodeList(listNode.next, list);
        }
        return list;
    }

    public ListNode constructListNode(int val, ListNode listNode) {
        if (listNode == null) {
            listNode = new ListNode(val);
        } else if (listNode.next == null) {
            listNode.next = new ListNode(val);
        } else {
            constructListNode(val, listNode.next);
        }
        return listNode;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stopwatch stopwatch = Stopwatch.createStarted();

        List<Integer> nodeList1 = new ArrayList<Integer>();
        getNodeList(l1, nodeList1);

        List<Integer> nodeList2 = new ArrayList<Integer>();
        getNodeList(l2, nodeList2);

        int iLen = nodeList1.size() > nodeList2.size() ? nodeList1.size() : nodeList2.size();

        List<Integer> result = new ArrayList<Integer>();
        int carry = 0;
        for (int i = 0; i < iLen; i++) {
            int a = i < nodeList1.size() ? nodeList1.get(i) : 0;
            int b = i < nodeList2.size() ? nodeList2.get(i) : 0;
            int sum = a + b + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }

        if (carry != 0) {
            result.add(carry);
        }

        ListNode listNode = null;
        for (Integer integer : result) {
            listNode = constructListNode(integer, listNode);
        }
        logger.info("addTwoNumbers({}, {}) -> {}. spend:{}ms", l1, l2, listNode, stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));
        return listNode;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            ListNode a = this;
            String str = "{" + this.val + "";
            while (a.next != null) {
                a = a.next;
                str += "," + a.val;
            }
            return str + "}";
        }
    }
}
