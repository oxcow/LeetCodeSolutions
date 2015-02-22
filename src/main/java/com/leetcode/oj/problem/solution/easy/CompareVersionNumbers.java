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

        int iMinLen = Math.min(iVer1Len, iVer2Len);

        // 比较相同部分
        for (int i = 0; i < iMinLen; i++) {
            int subVer1Int = Integer.valueOf(versions1[i]).intValue();
            int subVer2Int = Integer.valueOf(versions2[i]).intValue();
            if (subVer1Int == subVer2Int) continue;
            return subVer1Int > subVer2Int ? 1 : -1;
        }

        // 判断超出的部分
        if (iVer1Len > iVer2Len) {
            for (int i = iVer2Len; i < iVer1Len; i++) { // 判断超出部分是否都为0
                if (Integer.valueOf(versions1[i]).intValue() != 0) return 1;
            }
            return 0;
        } else {
            for (int i = iVer1Len; i < iVer2Len; i++) {
                if (Integer.valueOf(versions2[i]).intValue() != 0) return -1;
            }
            return 0;
        }
    }
}
