package xyz.fusheng.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @FileName: No28AchieveStr
 * @Author: code-fusheng
 * @Date: 2020/8/27 21:02
 * @version: 1.0
 * Description: No.28 实现 strStr()
 * Word Interpret : Achieve - 实现
 */

public class No28AchieveStrZH {

    public static int achieveStr(String haystack, String needle) {
        int L = needle.length(), n = haystack.length();

        for (int start = 0; start < n - L + 1; ++start) {
            if (haystack.substring(start, start + L).equals(needle)) {
                return start;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // String str1 = "hello";
        // String str2 = "ll";
        // String str1 = "aaaaa";
        // String str2 = "bba";
        String str1 = "";
        String str2 = "";
        System.out.println(achieveStr(str1, str2));
    }


}
