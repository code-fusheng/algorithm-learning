package xyz.fusheng.华为笔试;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

/**
 * @FileName: HJ2Main
 * @Author: code-fusheng
 * @Date: 2022/5/9 23:05
 * @Version: 1.0
 * @Description: HJ2 计算某字符出现次数
 */

public class HJ2Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        char t = scanner.nextLine().toLowerCase().charAt(0);

        long count = 0;

        for (char s : str.toCharArray()) {
            if (Objects.equals(s, t)) {
                count ++;
            }
        }

        System.out.println(count);

    }

}
