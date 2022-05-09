package xyz.fusheng.华为笔试;

import java.util.Scanner;

/**
 * @FileName: BaseTest
 * @Author: code-fusheng
 * @Date: 2022/5/9 22:44
 * @Version: 1.0
 * @Description:
 */

public class Main {

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
