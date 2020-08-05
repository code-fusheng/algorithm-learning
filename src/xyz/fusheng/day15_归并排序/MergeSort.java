package xyz.fusheng.day15_归并排序;

import java.util.Arrays;

/**
 * @FileName: MergeSort
 * @Author: code-fusheng
 * @Date: 2020/8/5 12:11
 * @version: 1.0
 * Description: 归并排序
 */

public class MergeSort {

    /**
     * 辅助数组
     */
    private static int[] assets;

    /**
     * 对数组内元素排序
     * @param arr
     */
    public static void sort(int[] arr) {
        // 初始化辅助数组
        assets = new int[arr.length];
        // 获取 lo 和 hi
        int lo = 0;
        int hi = arr.length - 1;
        // 进行排序流程
        sort(arr, lo, hi);
    }

    private static void sort(int[] arr, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        //
        int mid = (hi + lo) / 2;
        //
        sort(arr, lo, mid);
        //
        sort(arr, mid + 1, hi);
        merge(arr, lo, mid, hi);
    }

    private static void merge(int[] arr, int lo, int mid, int hi) {
        // 从lo到mid这组数据和mid+1到hi这组数据归并到assets对应的所引出
        int i = lo;
        int p1 = lo;
        int p2 = mid + 1;
        // 比较左边小组和右边小组中的元素大小，哪个小，就把哪个数组填充到assets中
        while (p1 <= mid && p2 <= hi) {
            if (less(arr[p1], arr[p2])) {
                assets[i++] = arr[p1++];
            } else {
                assets[i++] = arr[p2++];
            }
        }
        // 上面的循环结束后，如果退出循环的条件是p1<=mid，则说明左边小组中的数据已经归并完毕
        // 如果退出循环的条件是p2<=hi，则说明右边小组中的数据已经填充完毕.
        while (p1 <= mid) {
            // 说明左子组没有排序完
            assets[i++] = arr[p1++];
        }

        while (p2 <= hi) {
            // 说明右子组没有排序完
            assets[i++] = arr[p2++];
        }
        // 到现在为止，assets中的数据，从lo到hi是有序的
        for (int j = lo; j <= hi; j++) {
            arr[j] = assets[j];
        }
    }

    /**
     * 判断v是否小于w
     *
     * @param v
     * @param w
     * @return
     */
    private static boolean less(int v, int w) {
        return v < w;
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
        MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
