package xyz.fusheng;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            k = in.nextInt();
        }
        int result = 0;
        int first = 1;
        int second = 1;
        for (int i = 1; i <= k; i ++ ) {
            if (i == 1) {
                result = 1;
            } else if (i == 2) {
                result = 1;
            } else {
                result = first + second;
                first = second;
                second = result;
            }
        }
        System.out.println(result);
    }
}
