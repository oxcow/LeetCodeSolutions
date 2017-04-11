package com.leetcode.oj.problem.solution.easy;

import com.leetcode.oj.problem.solution.common.ListNode;

import java.util.ArrayDeque;
import java.util.Queue;

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
