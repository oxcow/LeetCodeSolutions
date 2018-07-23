package com.leetcode.oj.problem.solution.medium;

import com.leetcode.oj.problem.solution.common.ListNode;
import junit.framework.Assert;
import org.junit.Test;

public class RotateListTest {

    @Test
    public void rotateRight() {
        RotateList list = new RotateList();

        ListNode listNode = ListNode.creator(new Integer[]{1, 2, 3, 4, 5});
        Assert.assertEquals("{4,5,1,2,3}", list.rotateRight(listNode, 2).toString());


        listNode = ListNode.creator(new Integer[]{0, 1, 2});
        Assert.assertEquals("{2,0,1}", list.rotateRight(listNode, 4).toString());

        listNode = ListNode.creator(new Integer[]{});
        Assert.assertNull(list.rotateRight(listNode, 0));

        listNode = ListNode.creator(new Integer[]{1, 2});
        Assert.assertEquals(listNode, list.rotateRight(listNode, 0));
    }
}