package xyz.fusheng.day11_冒泡排序;

import java.util.Arrays;

/**
 * @FileName: BubbleSort
 * @Author: code-fusheng
 * @Date: 2020/8/4 16:11
 * @version: 1.0
 * Description: 冒泡排序
 */

public class BubbleSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        // 外层控制循环比较轮数 i
        for (int i = 0; i < arr.length; i++) {
            // 内层循环控制每一轮比较次数，每进行一轮排序都会找出一个（较大值）
            // （arr.length - 1）防止数组越界，（arr.length - 1 -i）减少比较次数
            for (int j = 0; j < arr.length - 1 -i; j ++) {
                // 前面的数与后面的数做比较
                if (greater(arr[j], arr[j + 1])) {
                    // 前面的数大于后面的数就做交换处理
                    exchange(arr, j, j + 1);
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
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
