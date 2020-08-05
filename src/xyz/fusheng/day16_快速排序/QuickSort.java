package xyz.fusheng.day16_快速排序;

import java.util.Arrays;

/**
 * @FileName: QuickSort
 * @Author: code-fusheng
 * @Date: 2020/8/5 13:53
 * @version: 1.0
 * Description: 快速排序
 */

public class QuickSort {

    /**
     * 对数组内元素进行排序
     * @param a
     */
    public static void sort(int[] a) {
        // 获取lo和hi
        int lo = 0;
        int hi = a.length - 1;
        sort(a, lo, hi);
    }

    /**
     * 对数组a中从索引lo到索引hi之间的元素进行排序
     * @param a
     * @param lo
     * @param hi
     */
    private static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        // 对a数组中，从lo到hi之间的元素进行切分
        int p = partition(a, lo, hi);
        // 对左边分组中的元素进行排序
        sort(a, lo, p - 1);
        sort(a, p + 1, hi);
    }

    /**
     * 对数组a中，从索引lo到索引hi之间的元素进行切分
     * @param a
     * @param lo
     * @param hi
     * @return
     */
    private static int partition(int[] a, int lo, int hi) {
        // 把最左边的值视为基准值
        int key = a[lo];
        // 定义一个左侧指针，初始指向最左边的元素
        int left = lo;
        // 定义一个右侧指针，初始指向右侧元素下一个位置
        int right = hi + 1;
        // 进行切分
        while (true) {
            // 从右往左扫描，找到一个比基准值小的元素
            while (less(key, a[--right])) {
                // 循环停止，说明找到了一个比基准值小的元素
                if (right == lo) {
                    // 说明已经扫描到最左边了，无需再扫描
                    break;
                }
            }
            // 再次从左往右扫描，找到一个比基准值更大的元素
            while (less(a[++left], key)) {
                // 循环停止，说明找到了一个比基准值大的元素
                if (left == hi) {
                    // 说明已经扫描到最右边了，无需再扫描
                    break;
                }
            }

            if (left >= right) {
                // 扫描完所有的元素，结束循环
                break;
            } else {
                // 没有扫描完，直接交换left和right位置的元素
                exchange(a, left, right);
            }
        }
        // 交换最后right索引处和基准值所在的索引处的值
        exchange(a, lo, right);
        return right;
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
     * 交换数组a的i和j下标位置的值
     *
     * @param a
     * @param i
     * @param j
     */
    private static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

class Test {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
