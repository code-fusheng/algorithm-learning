package xyz.fusheng.day0_排序测试;

import xyz.fusheng.day11_冒泡排序.BubbleSort;
import xyz.fusheng.day13_插入排序.InsertionSort;
import xyz.fusheng.day14_希尔排序.ShellSort;

/**
 * @FileName: Test
 * @Author: code-fusheng
 * @Date: 2020/8/5 11:29
 * @version: 1.0
 * Description: 测试类
 */

public class Test {
    public static void main(String[] args) {
        int[] a1 = new int[10000];
        int[] a2 = new int[10000];
        for (int i = 0; i < 10000; i++) {
            // 生成随机数，1-10000
            int num = (int)Math.random() * 10000 + 1;
            a1[i] = num;
            a2[i] = num;
        }

        long start = System.nanoTime();
        InsertionSort.sort(a1);
        long end = System.nanoTime();
        System.out.println(end - start);

        start = System.nanoTime();
        ShellSort.sort(a2);
        end = System.nanoTime();
        System.out.println(end - start);
    }
}
