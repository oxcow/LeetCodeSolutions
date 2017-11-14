package com.leetcode.oj.problem.solution.common;

import org.junit.Test;

import java.util.List;

/**
 * Created by wli on 2017-11-14.
 */
public class BigDataReaderTest {
    String filePath = "D:\\WorkSpace\\myWorkspace\\LeetCodeSolutions\\src\\test\\java\\com\\leetcode\\oj\\problem\\solution\\common\\";


    @Test
    public void readString() throws Exception {
        List<String> txts = BigDataReader.readAllLines(filePath + "read.txt");
        System.out.println(txts);
    }



}