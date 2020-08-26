package xyz.fusheng.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @FileName: No151WordsReverse
 * @Author: code-fusheng
 * @Date: 2020/8/25 21:55
 * @version: 1.0
 * Description: No.151 - 翻转字符串里的单词
 */

public class No151WordsReverse {

    public static String reverseWords(String s) {
        // 除去开头和末尾的空白字符
        s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        // 将一段字符串根据空格分割成数段字符串 也就是字符串数组List
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        // 集合工具类的反转数组方法
        Collections.reverse(wordList);
        // String join() 方法
        return String.join(" ", wordList);
    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();

        String str = "the sky is blue";

        System.out.println(reverseWords(str));
    }

}
