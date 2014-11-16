package com.leetcode.oj.problem.solution.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * URL:  <a href="https://oj.leetcode.com/problems/longest-common-prefix/">longest-common-prefix</a>
 * <p/>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p/>
 * 查找字符串数组中最常用的通用字符前缀
 * <p/>
 * 1. 忽略null
 * 2. 如果存在空字符串，则返回空字符串
 * Created by leeyee.li on 2014/11/15.
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if (null == strs) return null;

        String commonPrefix = "";

        String base = "";

        int i = 0;

        String notBlankStrings[] = new String[strs.length];

        for (String str : strs) {
            if (str != null) {
                if ("".equals(str)) return "";

                if ("".equals(base)) {
                    base = str;
                } else {
                    notBlankStrings[i++] = str;
                }
            }
        }

        for (char chr : base.toCharArray()) {

            for (String str : notBlankStrings) {
                if (str != null) {
                    if (!str.startsWith(commonPrefix + chr)) {
                        return commonPrefix;
                    }
                } else {
                    break;
                }
            }
            commonPrefix += chr;
        }
        return commonPrefix;
    }

    public static String longestCommonPrefixDependList(String... strs) {

        if (null == strs) return null;

        List<String> notBlankStrings = new ArrayList<String>();

        for (String str : strs) {
            if (str != null) {
                if ("".equals(str)) return "";
                notBlankStrings.add(str);
            }
        }

        int iMinStrsSize = notBlankStrings.size();

        if (iMinStrsSize == 0) return "";

        if (iMinStrsSize == 1) return notBlankStrings.get(0);

        String base = notBlankStrings.get(0);

        String commonPrefix = "";

        for (char chr : base.toCharArray()) {

            if (Character.isWhitespace(chr)) return "";

            for (int i = 1; i < iMinStrsSize; i++) {
                if (!notBlankStrings.get(i).startsWith(commonPrefix + chr)) {
                    return commonPrefix;
                }
            }
            commonPrefix += chr;

        }
        return commonPrefix;
    }
}
