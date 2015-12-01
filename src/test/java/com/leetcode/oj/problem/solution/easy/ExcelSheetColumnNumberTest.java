package com.leetcode.oj.problem.solution.easy;

import junit.framework.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExcelSheetColumnNumberTest {
    private static final Logger logger = LoggerFactory.getLogger(ExcelSheetColumnTitleTest.class);

    private static final Executor executor = Executors.newFixedThreadPool(5);

    final ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
    final ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
    
    @Test
    public void testTitleToNumber() throws Exception {
        int loop = Integer.MAX_VALUE / 1000;
        final CountDownLatch countDownLatch = new CountDownLatch(loop);
        for (int i = 1; i <= loop; i++) {
            final int finalI = i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    String title = excelSheetColumnTitle.convertToTitle(finalI);
                    int columnNumber = excelSheetColumnNumber.titleToNumber(title);
                    logger.debug("title={},row={}", title, columnNumber);
                    Assert.assertEquals(columnNumber, finalI);
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
    }
}