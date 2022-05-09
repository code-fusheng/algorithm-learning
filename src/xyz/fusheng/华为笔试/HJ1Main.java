package xyz.fusheng.华为笔试;

import java.util.Scanner;

/**
 * @FileName: HJ1Main
 * @Author: code-fusheng
 * @Date: 2022/5/9 23:00
 * @Version: 1.0
 * @Description: HJ1 字符串最后一个单词的长度
 */

public class HJ1Main {

    public static int endStrLength(String str) {
        String[] strs = str.split(" ");
        String endStr = strs[strs.length - 1];
        return endStr.length();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        System.out.println(endStrLength(str));

    }

}
