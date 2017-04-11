package com.leetcode.oj.problem.solution.common;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by leeyee on 2017/4/11.
 */
public final class BigDataReader {
    private static final Logger logger = LoggerFactory.getLogger(BigDataReader.class);

    public enum Sep {

        comma(",");

        String sign;

        Sep(String sign) {
            this.sign = sign;
        }
    }

    public static final int[] readInt(String filePath, Sep sep) {

        Stopwatch stopwatch = Stopwatch.createStarted();
        int[] bigNums = null;
        try {
            Scanner scanner = new Scanner(new File(filePath));
            scanner.useDelimiter(sep.sign);
            List<Integer> numList = Lists.newArrayList();
            while (scanner.hasNext()) {
                numList.add(Integer.valueOf(scanner.next().trim()));
            }
            bigNums = new int[numList.size()];
            for (int i = 0; i < numList.size(); i++) {
                bigNums[i] = numList.get(i);
            }
        } catch (Exception e) {

        } finally {
            logger.info("get big num array, size:{}, spend:{}ms"
                    , bigNums == null ? 0 : bigNums.length
                    , stopwatch.stop().elapsed(TimeUnit.MILLISECONDS));
        }
        return bigNums;
    }

}
