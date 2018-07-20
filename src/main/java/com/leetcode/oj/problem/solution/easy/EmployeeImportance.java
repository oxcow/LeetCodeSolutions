package com.leetcode.oj.problem.solution.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * URL: <a href="https://leetcode.com/problems/employee-importance/description/">Employee Importance</a>
 * <p>
 * You are given a data structure of employee information, which includes the employee's unique id, his importance value and his direct subordinates' id.
 * <p>
 * For example, employee 1 is the leader of employee 2, and employee 2 is the leader of employee 3. They have importance value 15, 10 and 5, respectively. Then employee 1 has a data structure like [1, 15, [2]], and employee 2 has [2, 10, [3]], and employee 3 has [3, 5, []]. Note that although employee 3 is also a subordinate of employee 1, the relationship is not direct.
 * <p>
 * Now given the employee information of a company, and an employee id, you need to return the total importance value of this employee and all his subordinates.
 * <p>
 * Example 1:
 * Input: [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
 * Output: 11
 * Explanation:
 * Employee 1 has importance value 5, and he has two direct subordinates: employee 2 and employee 3. They both have importance value 3. So the total importance value of employee 1 is 5 + 3 + 3 = 11.
 * Note:
 * One employee has at most one direct leader and may have several subordinates.
 * The maximum number of employees won't exceed 2000.
 */
public class EmployeeImportance {

    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;

        public Employee() {
        }

        public Employee(int id, int importance, List<Integer> subordinates) {
            this.id = id;
            this.importance = importance;
            this.subordinates = subordinates;
        }
    }

    public int getImportance(List<Employee> employees, int id) {

        if (employees == null || employees.size() == 0) return 0;

        Map<Integer, Employee> map = new HashMap<>();

        Employee leader = null;
        // 使用stream方式遍历employees，提交leetcode后，跑完所有测试消耗时间比iter要多。
        for (Employee employee : employees) {
            if (employee.id == id) {
                leader = employee;
            } else {
                map.put(employee.id, employee);
            }
        }

        if (leader == null) return 0;

        return leader.importance + getAllSubordinateImportance(map, leader.subordinates);
    }

    private int getAllSubordinateImportance(Map<Integer, Employee> map, List<Integer> subordinates) {
        int importance = 0;
        if (subordinates != null && !subordinates.isEmpty()) {
            for (Integer subId : subordinates) {
                Employee employee = map.getOrDefault(subId, null);
                if (employee != null) {
                    importance += employee.importance + getAllSubordinateImportance(map, employee.subordinates);
                }
            }
        }
        return importance;
    }

}
