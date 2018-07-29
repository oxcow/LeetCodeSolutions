package com.leetcode.oj.problem.solution.easy;

import com.leetcode.oj.problem.solution.common.ListNode;

import java.util.*;

/**
 * URL: <a href="https://leetcode.com/problems/merge-two-sorted-lists/description/">Merge Two Sorted Lists</a>
 * <p>
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        List<Integer> vals = new ArrayList<>();
        do {
            vals.add(l1.val);
            l1 = l1.next;
        } while (l1 != null);

        do {
            vals.add(l2.val);
            l2 = l2.next;
        } while (l2 != null);


        ListNode merge = null;
        ListNode mergeFirstNode = null;
        List<Integer> toSort = new ArrayList<>();
        for (Integer val : vals) {
            toSort.add(val);
        }
        toSort.sort(null);
        for (Integer val : toSort) {
            if (merge == null) {
                merge = new ListNode(val);
                mergeFirstNode = merge;
            } else {
                merge.next = new ListNode(val);
                merge = merge.next;
            }
        }
        return mergeFirstNode;
    }

    public ListNode mergeTwoListsByRecursive(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoListsByRecursive(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoListsByRecursive(l1, l2.next);
            return l2;
        }
    }
}
