package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://leetcode.com/problems/student-attendance-record-i/description/">Student Attendance Record I</a>
 * <p>
 * You are given a string representing an attendance record for a student. The record only contains the following three characters:
 * <p>
 * 'A' : Absent.
 * 'L' : Late.
 * 'P' : Present.
 * A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
 * <p>
 * You need to return whether the student could be rewarded according to his attendance record.
 * <p>
 * Example 1:
 * Input: "PPALLP"
 * Output: True
 * Example 2:
 * Input: "PPALLL"
 * Output: False
 * <p>
 * Created by leeyee on 2017/09/04.
 */
public class StudentAttendanceRecordI {
    /**
     * common solution
     * <p>
     * Time complexity: O(n)
     * <p>
     * Space complexity: O(1)
     *
     * @param s
     * @return
     */
    public boolean checkRecord(String s) {
        if (s == null || s.length() == 0) return false;
        char[] chars = s.toCharArray();
        boolean reward = true;
        int absent = 0;
        int present = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 'L') present = 0;
            if (chars[i] == 'A' && ++absent > 1) {
                reward = false;
                break;
            }
            if (chars[i] == 'L' && ++present > 2) {
                reward = false;
                break;
            }
        }
        return reward;
    }
}
