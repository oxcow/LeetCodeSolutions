package com.leetcode.oj.problem.solution.easy;

/**
 * URL: <a href="https://oj.leetcode.com/problems/compare-version-numbers/">Compare Version Numbers </a>f
 * <p/>
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
 * <p/>
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
 * <p/>
 * Here is an example of version numbers ordering:
 * <pre/>
 * 0.1 < 1.1 < 1.2 < 13.37
 * </pre>
 * Created by leeyee.li on 2015/2/22.
 */
public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        if (version1 == null || version1.trim().equals("")) return -2;
        if (version2 == null || version2.trim().equals("")) return -2;

        String[] versions1 = version1.trim().split("\\.");
        String[] versions2 = version2.trim().split("\\.");

        int iVer1Len = versions1.length;
        int iVer2Len = versions2.length;

        int iMaxLen = Math.max(iVer1Len, iVer2Len);

        for (int i = 0; i < iMaxLen; i++) {
            int subVer1Int = i < iVer1Len ? Integer.valueOf(versions1[i]) : 0; // 超出数组范围返回0
            int subVer2Int = i < iVer2Len ? Integer.valueOf(versions2[i]) : 0;
            if (subVer1Int == subVer2Int) continue;
            return subVer1Int > subVer2Int ? 1 : -1;
        }
        return 0;
    }
}
