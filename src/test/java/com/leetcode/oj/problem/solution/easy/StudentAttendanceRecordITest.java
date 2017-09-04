package com.leetcode.oj.problem.solution.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leeyee on 2017/09/04.
 */
public class StudentAttendanceRecordITest {
    @Test
    public void checkRecord() throws Exception {
        StudentAttendanceRecordI record = new StudentAttendanceRecordI();
        Assert.assertTrue(record.checkRecord("P"));
        Assert.assertTrue(record.checkRecord("PLPLPLL"));
        Assert.assertFalse(record.checkRecord("APPA"));
        Assert.assertTrue(record.checkRecord("PPALLP"));
        Assert.assertFalse(record.checkRecord("PPALLL"));
    }

}