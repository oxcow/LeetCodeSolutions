package com.leetcode.oj.problem.solution.easy;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * URL: <a href="https://leetcode.com/problems/reverse-linked-list/">Reverse Linked List</a>
 * <p>
 * Reverse a singly linked list.
 * <p>
 * click to show more hints.
 * <p>
 * Hint:
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 * <p>
 * Subscribe to see which companies asked this question
 * <p>
 * Created by leeyee on 16-3-5.
 */
public class ReverseLinkedList {
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


    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(head.val);
        while (head.next != null) {
            head = head.next;
            queue.add(head.val);
        }

        ListNode listNode = null;
        while (!queue.isEmpty()) {
            int top = queue.poll();
            ListNode ln = new ListNode(top);
            if (listNode != null) {
                ln.next = listNode;
            }
            listNode = ln;
        }
        return listNode;
    }

}
