package com.leetcode.oj.problem.solution.easy;

import com.google.common.collect.Lists;
import junit.framework.Assert;
import org.junit.Test;

public class EmployeeImportanceTest {

    @Test
    public void getImportance() {
        EmployeeImportance importance = new EmployeeImportance();


        EmployeeImportance.Employee e3 = importance.new Employee(3, 5, Lists.newArrayList());
        EmployeeImportance.Employee e2 = importance.new Employee(2, 10, Lists.newArrayList(3));
        EmployeeImportance.Employee e1 = importance.new Employee(1, 15, Lists.newArrayList(2));
        Assert.assertEquals(30, importance.getImportance(Lists.newArrayList(e1, e2, e3), 1));
        Assert.assertEquals(15, importance.getImportance(Lists.newArrayList(e1, e2, e3), 2));
        Assert.assertEquals(5, importance.getImportance(Lists.newArrayList(e1, e2, e3), 3));


        e3 = importance.new Employee(3, 3, Lists.newArrayList());
        e2 = importance.new Employee(2, 3, Lists.newArrayList());
        e1 = importance.new Employee(1, 5, Lists.newArrayList(2, 3));
        Assert.assertEquals(11, importance.getImportance(Lists.newArrayList(e1, e2, e3), 1));
        Assert.assertEquals(3, importance.getImportance(Lists.newArrayList(e1, e2, e3), 2));
        Assert.assertEquals(3, importance.getImportance(Lists.newArrayList(e1, e2, e3), 3));

        EmployeeImportance.Employee e4 = importance.new Employee(4, 1, Lists.newArrayList());
        e3 = importance.new Employee(3, 4, Lists.newArrayList());
        e2 = importance.new Employee(2, 3, Lists.newArrayList(4));
        e1 = importance.new Employee(1, 5, Lists.newArrayList(2, 3));
        Assert.assertEquals(13, importance.getImportance(Lists.newArrayList(e1, e2, e3, e4), 1));

    }
}