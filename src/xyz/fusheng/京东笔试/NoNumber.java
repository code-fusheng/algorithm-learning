package xyz.fusheng.京东笔试;

import java.util.Scanner;

/**
 * @FileName: NoNumber
 * @Author: code-fusheng
 * @Date: 2020/8/27 19:28
 * @version: 1.0
 * Description: 第 N 个数
 */

public class NoNumber {


    public static int checkNumber(int k) {
        int result = 0;
        int flag = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i ++) {
            char[] chars = Integer.toString(i).toCharArray();
            for (int j = 0; j < chars.length; j ++) {
                if (chars[j] == '2' || chars[j] == '3' || chars[j] == '5') {
                    if (j == chars.length - 1) {
                        flag ++;
                        if (flag == k) {
                            result = i;
                            return result;
                        }
                    }
                } else {
                    break;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(checkNumber(k));
    }

}
