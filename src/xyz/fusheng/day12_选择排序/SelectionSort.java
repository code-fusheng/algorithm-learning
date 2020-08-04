package xyz.fusheng.day12_选择排序;

import java.util.Arrays;

/**
 * @FileName: SelectionSort
 * @Author: code-fusheng
 * @Date: 2020/8/4 19:04
 * @version: 1.0
 * Description: 选择排序
 */

public class SelectionSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            // 保存最小数的索引，假定本次遍历，当前 i 位置是最小数
            int minIndex = i;
            // 确定最小值后，开始接着下一位循环，找是否存在比最小值更小的
            for (int j = i + 1; j < len; j++) {
                if (greater(arr[minIndex], arr[j])) {
                    // 更换最小值
                    minIndex = j;
                }
            }
            // 比较完了，当前 minIndex 就是本次循环的最小值
            exchange(arr, i, minIndex);
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
        SelectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
