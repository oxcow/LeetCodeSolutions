package com.leetcode.oj.problem.solution.easy;

import com.leetcode.oj.problem.solution.common.StringHelper;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leeyee on 2017/8/18.
 */
public class ReshapeTheMatrixTest {
    @Test
    public void matrixReshape() throws Exception {
        ReshapeTheMatrix rm = new ReshapeTheMatrix();

        Assert.assertEquals("[[1,2,3,4]]"
                , StringHelper.toString(rm.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4)));
        Assert.assertEquals("[[1,2],[3,4]]"
                , StringHelper.toString(rm.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 2, 4)));
        Assert.assertEquals("[[1,2],[3,4]]"
                , StringHelper.toString(rm.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 2, 2)));
        Assert.assertEquals("[[1],[2],[3],[4]]"
                , StringHelper.toString(rm.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 4, 1)));
    }

}