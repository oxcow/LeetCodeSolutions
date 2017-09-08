package com.leetcode.oj.problem.solution.common;

import com.google.common.base.Joiner;

import java.util.stream.IntStream;

/**
 * Created by leeyee on 2017/8/18.
 */
public final class StringHelper {

    public static final Joiner JOINER_COMMA = Joiner.on(",").skipNulls();

    public static final String toString(int[][] objs) {
        if (objs == null) return null;
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < objs.length; i++) {
            sb.append("[")
                    .append(JOINER_COMMA.join(IntStream.of(objs[i]).boxed().toArray()))
                    .append("]");
            if (i < objs.length - 1) sb.append(",");
        }

        sb.append("]");

        return sb.toString();
    }

    public static final String toString(int... objs) {
        if (objs == null || objs.length == 0) return "[]";
        return "[" + JOINER_COMMA.join(IntStream.of(objs).boxed().toArray()) + "]";
    }
}
