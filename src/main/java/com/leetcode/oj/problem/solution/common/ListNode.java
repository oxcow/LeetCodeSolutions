package com.leetcode.oj.problem.solution.common;

import com.leetcode.oj.problem.solution.easy.ReverseLinkedList;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by leeyee on 2017/4/11.
 */
public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode creator(Integer[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (Integer integer : Arrays.asList(arr)) {
            stack.push(integer);
        }
        ListNode listNode = null;
        while (!stack.isEmpty()) {
            int top = stack.pop();
            ListNode ln = new ListNode(top);
            if (listNode != null) {
                ln.next = listNode;
            }
            listNode = ln;
        }
        return listNode;
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
