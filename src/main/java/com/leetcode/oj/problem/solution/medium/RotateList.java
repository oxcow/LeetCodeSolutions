package com.leetcode.oj.problem.solution.medium;

import com.leetcode.oj.problem.solution.common.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * URL: <a href="https://leetcode.com/problems/rotate-list/description/">Rotate List</a>
 * <p>
 * Given a linked list, rotate the list to the right by k places, where k is non-negative.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->2->3->4->5->NULL, k = 2
 * Output: 4->5->1->2->3->NULL
 * Explanation:
 * rotate 1 steps to the right: 5->1->2->3->4->NULL
 * rotate 2 steps to the right: 4->5->1->2->3->NULL
 * Example 2:
 * <p>
 * Input: 0->1->2->NULL, k = 4
 * Output: 2->0->1->NULL
 * Explanation:
 * rotate 1 steps to the right: 2->0->1->NULL
 * rotate 2 steps to the right: 1->2->0->NULL
 * rotate 3 steps to the right: 0->1->2->NULL
 * rotate 4 steps to the right: 2->0->1->NULL
 */
public class RotateList {

    public static final Logger LOGGER = LoggerFactory.getLogger(RotateList.class);

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) return head;

        Map<Integer, ListNode> deepListNodeMap = new HashMap<>();

        int deep = 0; // root

        deepListNodeMap.put(deep, head);

        while (head.next != null) {
            deepListNodeMap.put(++deep, head.next);
            head = head.next;
        }

        LOGGER.debug("ListNode deep {} is: {}", deep + 1, deepListNodeMap);

        int[] rotatedKeys = new int[deep + 1];

        k %= (deep + 1);
        for (int i = 0; i <= deep; i++) {
            if (i + k <= deep) {
                rotatedKeys[i + k] = i;
            } else {
                rotatedKeys[k - deep + i - 1] = i;
            }
        }
        LOGGER.debug("rotated keys are {}", rotatedKeys);

        ListNode listNode = null;
        for (int i = deep; i >= 0; i--) {
            ListNode ln = new ListNode(deepListNodeMap.get(rotatedKeys[i]).val);
            if (listNode != null) {
                ln.next = listNode;
            }
            listNode = ln;
        }

        LOGGER.debug("rotated list node is  {}", listNode);

        return listNode;
    }
}
