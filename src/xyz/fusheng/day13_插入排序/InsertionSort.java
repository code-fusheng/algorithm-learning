package xyz.fusheng.day13_插入排序;

import java.util.Arrays;

/**
 * @FileName: InsertionSort
 * @Author: code-fusheng
 * @Date: 2020/8/4 20:25
 * @version: 1.0
 * Description: 插入排序
 */

public class InsertionSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int len = arr.length;
        // 从 1 位置开始， 0 位置为第一个元素，可以看做有序
        for (int i = 1; i < len; i++) {
            // 倒序遍历当前元素前面的
            for (int j = i; j > 0; j--) {
                // 将待插入元素与有序序列依次比较
                if (greater(arr[j -1], arr[j])) {
                    exchange(arr, j - 1, j);
                } else {
                    break;
                }
            }
        }
    }

    /**
     * 判断 l 是否大于 c
     * @param l lord 擂主
     * @param c competitors 竞争者
     * @return
     */
    private static boolean greater(int l, int c) {
        return l > c;
    }

    /**
     * 交换数组a的指定下标i、j的值
     * @param a 指定的数组
     * @param i 指定的下标 前面的值
     * @param j 指定的下标 后面的值
     */
    private static void exchange(int[] a, int i, int j ) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

class Test {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
