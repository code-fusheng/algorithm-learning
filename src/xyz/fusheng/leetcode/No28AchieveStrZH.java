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
        if ( haystack == "" && needle == "") {
            return 0;
        }
        int result = 0;
        boolean flag = true;
        int count = 0;

        char[] chars1 = haystack.toCharArray();
        char[] chars2 = needle.toCharArray();

        int mark1 = 0;
        int mark2 = 0;

        for (int i = mark1; i < chars1.length; i ++) {
            for (int j = mark2; j < chars2.length;  j ++) {
                if (chars1[i] == chars2[j]) {
                    mark1 = i;
                    mark2 = j + 1;
                    count ++;
                    if (flag) {
                        result = mark1;
                        flag = false;
                    }
                    if (j == chars2.length - 1 && count == chars2.length) {
                        return result;
                    }
                    break;
                } else {
                    count = 0;
                    mark2 = 0;
                    if (j == chars2.length - 1 && flag == false) {
                        return -1;
                    }
                    flag = true;
                }
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
