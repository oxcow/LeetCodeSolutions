package com.leetcode.oj.problem.solution.medium;

import com.google.common.base.Stopwatch;
import com.leetcode.oj.problem.solution.common.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;
import java.util.concurrent.TimeUnit;

/**
 * 使用Stack处理
 * <p/>
 * 该方式与 AddTowNumbersUseRecursive 相比不依赖 JVM 栈的大小。因此在处理上支持的范围更大。
 * <p/>
 * 速度方面，如果 ListNode 的深度不大，那么递归处理方式会比较快点。
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
 * @see com.leetcode.oj.problem.solution.medium.AddTowNumbersUseRecursive
 */
public class AddTowNumbersUseStack {
    private static final Logger logger = LoggerFactory.getLogger(AddTowNumbersUseStack.class);

    /**
     * 将ListNode的val保存到Stack中
     * <p/>
     * ListNode的最内层节点作为Stack的top
     *
     * @param listNode
     * @return
     */
    public Stack<Integer> convertListNodeToStack(ListNode listNode) {
        Stack<Integer> valStack = new Stack<>();
        valStack.push(listNode.val);
        while (listNode.next != null) {
            listNode = listNode.next;
            valStack.push(listNode.val);
        }
        return valStack;
    }

    /**
     * 将Stack转换成ListNode
     * <p/>
     * 栈顶元素是ListNode的最内层节点
     *
     * @param stack
     * @return
     */
    public ListNode convertStackToListNode(Stack<Integer> stack) {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stopwatch stopwatch = Stopwatch.createStarted();

        Stack<Integer> stack1 = convertListNodeToStack(l1);
        Stack<Integer> stack2 = convertListNodeToStack(l2);

        int iLen = stack1.size() > stack2.size() ? stack1.size() : stack2.size();

        Stack<Integer> result = new Stack<Integer>();
        int carry = 0;
        for (int i = 0; i < iLen; i++) {
            int a = i < stack1.size() ? stack1.get(i) : 0;
            int b = i < stack2.size() ? stack2.get(i) : 0;
            int sum = a + b + carry;
            result.push(sum % 10);
            carry = sum / 10;
        }
        if (carry != 0) result.push(carry); // 将最后的非零进位数入栈

        ListNode listNode = convertStackToListNode(result);
         logger.debug("spend:{}ms. addTwoNumbers({}, {}) -> {}", stopwatch.stop().elapsed(TimeUnit.MILLISECONDS), l1, l2, listNode);
        return listNode;
    }
}
