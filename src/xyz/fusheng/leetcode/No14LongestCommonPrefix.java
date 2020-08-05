package xyz.fusheng.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @FileName: No14LongestCommonPrefix
 * @Author: code-fusheng
 * @Date: 2020/8/5 18:39
 * @version: 1.0
 * Description: No14-最长公共前缀
 */

public class No14LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        // 当数组为null 或者长度为 0 时直接返回 ""
        if (strs == null || strs.length == 0) {
            return "";
        }
        // 随意选择一个子串的长度
        int len = strs[0].length();
        // 字符串数组的长度
        int count = strs.length;
        // 遍历子串 长度控制为随意一个子串，这里选择 strs[0] "flower" 长度为 6
        for (int i = 0; i < len; i++) {
            // 返回当前索引位置的字符 f -> l -> ...
            char c = strs[0].charAt(i);
            // 遍历字符串数组的每个子串的指定位置 i 是否与 c 相同
            for (int j = 1; j < count; j++) {
                // 随意一个子串的长度等于当前的 i,也就是当前遍历的索引位置，这里等于说名，那个子串的长度到头了
                // 子串中的当前位置元素不等于 c
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    // 截取初始位置到 i
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

}
