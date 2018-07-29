package com.leetcode.oj.problem.solution.easy;

import com.leetcode.oj.problem.solution.common.ListNode;
import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoSortedListsTest {

    ListNode l1 = ListNode.creator(new Integer[]{1, 2, 4});
    ListNode l2 = ListNode.creator(new Integer[]{1, 3, 4});

    @Test
    public void mergeTwoLists() {


        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        ListNode merge = mergeTwoSortedLists.mergeTwoLists(l1, l2);

        Assert.assertEquals("{1,1,2,3,4,4}", merge.toString());

    }

    @Test
    public void mergeTwoListsByRecursive() {

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        ListNode merge = mergeTwoSortedLists.mergeTwoListsByRecursive(l1, l2);

        Assert.assertEquals("{1,1,2,3,4,4}", merge.toString());

    }
}