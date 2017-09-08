package com.leetcode.oj.problem.solution.medium;

import com.leetcode.oj.problem.solution.common.BigDataReader;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by wli on 2017-09-08.
 */
public class MaximumXOROfTwoNumbersInAnArrayTest {
    BigDataReader.Sep sep = BigDataReader.Sep.comma;

    String basePath = "D:\\WorkSpace\\myWorkspace\\LeetCodeSolutions\\src\\test\\java\\com\\leetcode\\oj\\problem\\solution\\medium\\MaximumXOROfTwoNumbersInAnArray.txt";


    @Test
    public void findMaximumXOR() throws Exception {
        MaximumXOROfTwoNumbersInAnArray a = new MaximumXOROfTwoNumbersInAnArray();

        Assert.assertEquals(28, a.findMaximumXOR(new int[]{3, 10, 5, 25, 2, 8}));
    }

    /**
     * <table border=1>
     * <tr>
     * <td>index</td>
     * <td>value</td>
     * <td>value to binary string</td>
     * </tr>
     * <tr>
     * <td>3139</td>
     * <td>337548005</td>
     * <td>0010100000111101001001011100101</td>
     * </tr>
     * <tr>
     * <td>12928</td>
     * <td>1809935641</td>
     * <td>1101011111000010110110100011001</td>
     * </tr>
     * <tr>
     * <td  colspan=2>XOR</td>
     * <td>1111111111111111111111111111100</td>
     * </tr>
     * </table>
     */
    public void findMaximumXORForBig() throws Exception {
        MaximumXOROfTwoNumbersInAnArray a = new MaximumXOROfTwoNumbersInAnArray();
        Assert.assertEquals(2147483644, a.findMaximumXOR(BigDataReader.readInt(basePath, sep)));
    }

}