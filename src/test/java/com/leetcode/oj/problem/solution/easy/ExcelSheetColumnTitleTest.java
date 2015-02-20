package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class ExcelSheetColumnTitleTest {

    private static final Logger logger = LoggerFactory.getLogger(ExcelSheetColumnTitleTest.class);

    @Test
    public void testConvertToTitle() throws Exception {
        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        for (int i = 1; i < 16385; i++) {
            String title = excelSheetColumnTitle.convertToTitle(i);
            logger.info("row={},title={}", i, title);
            Assert.assertEquals(i, excelSheetColumnTitle.getRowNum(title));
        }
        Assert.assertEquals(65, Integer.valueOf('A').intValue());
        Assert.assertEquals(90, Integer.valueOf('Z').intValue());
    }
}