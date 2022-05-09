package xyz.fusheng.华为笔试;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @FileName: HJ3Main
 * @Author: code-fusheng
 * @Date: 2022/5/9 23:14
 * @Version: 1.0
 * @Description: HJ3 明明的随机数
 */

public class HJ3Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numCount = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numCount; i++) {
            list.add(scanner.nextInt());
        }
        List<Integer> collect = list.stream().distinct().sorted().collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

}
