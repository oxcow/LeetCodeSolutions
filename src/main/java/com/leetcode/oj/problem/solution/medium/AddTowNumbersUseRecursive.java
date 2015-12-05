package com.leetcode.oj.problem.solution.medium;

import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 使用递归方式进行ListNode的构造。
 * 该方式会受到递归次数的限制。递归次数过多( JVM )时会抛出java.lang.StackOverflowError异常
 * <p/>
 * URL: <a href="https://leetcode.com/problems/add-two-numbers/">Add Two Numbers</a>
 * <p/>
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p/>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * <p/>
 * Created by leeyee.li on 2015/12/1.
 *
 * @see com.leetcode.oj.problem.solution.medium.AddTowNumbersUseStack
 */
public class AddTowNumbersUseRecursive {
    private static final Logger logger = LoggerFactory.getLogger(AddTowNumbersUseRecursive.class);

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

    /**
     * 递归获取ListNode中的val
     *
     * @param listNode
     * @param list
     * @return
     */
    public List<Integer> getNodeList(ListNode listNode, List<Integer> list) {
        if (listNode != null) {
            list.add(listNode.val);
            getNodeList(listNode.next, list);
        }
        return list;
    }


    /**
     * 递归构造ListNode
     *
     * @param val
     * @param listNode
     * @return
     */
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

    //
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stopwatch stopwatch = Stopwatch.createStarted();

        List<Integer> nodeList1 = new ArrayList<Integer>();
        List<Integer> nodeList2 = new ArrayList<Integer>();
        getNodeList(l1, nodeList1);
        getNodeList(l2, nodeList2);

        int iLen = nodeList1.size() > nodeList2.size() ? nodeList1.size() : nodeList2.size();

        List<Integer> result = new ArrayList<Integer>();
        int carry = 0; // 进位数
        for (int i = 0; i < iLen; i++) {
            int a = i < nodeList1.size() ? nodeList1.get(i) : 0;
            int b = i < nodeList2.size() ? nodeList2.get(i) : 0;
            int sum = a + b + carry;
            result.add(sum % 10); // 余数
            carry = sum / 10; // 进位数
        }
        // 如果进位数不等于0，则需要记录
        if (carry != 0) result.add(carry);
        // 构造返回结果
        ListNode listNode = null;
        for (Integer integer : result) {
            listNode = constructListNode(integer, listNode);
        }
        logger.info("spend:{}ms. addTwoNumbers({}, {}) -> {}", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS), l1, l2, listNode);
        return listNode;
    }
}
