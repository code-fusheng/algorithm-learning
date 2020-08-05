package xyz.fusheng.day14_希尔排序;

import java.util.Arrays;

/**
 * @FileName: ShellSort
 * @Author: code-fusheng
 * @Date: 2020/8/5 10:58
 * @version: 1.0
 * Description: 希尔排序
 */

public class ShellSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        // 计算增量规则 h
        int len = arr.length;
        int h = 1;
        while (h < len / 2) {
            h = 2 * h + 1;
        }
        // 开始排序，只要 h 小于 1，就停止排序
        while (h >= 1) {
            // 找到待插入的元素
            for (int i = h; i < len; i++) {
                // 在这里，arr[i] 就是待插入的元素
                // arr[i] 分别与 arr[i-h]、arr[i-2h]、arr[i-3h]....比较
                for (int j = i; j >= h; j = j - h) {
                    // arr[j] 就是待插入的元素
                    // 分别与 arr[j-h]、arr[j-2h]、arr[j-3h]....比较
                    if (greater(arr[j - h], arr[j])) {
                        exchange(arr, j, j - h);
                    } else {
                        break;
                    }
                }
            }
            h = h / 2;
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
        ShellSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
