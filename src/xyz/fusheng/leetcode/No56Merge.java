package xyz.fusheng.leetcode;

import java.util.Arrays;

/**
 * @FileName: No56Merge
 * @Author: code-fusheng
 * @Date: 2020/8/5 16:41
 * @version: 1.0
 * Description: No56 合并区间
 */

public class No56Merge {
    /**
     * @param intervals 间隔
     * @return
     */
    public static int[][] merge(int[][] intervals) {
        // 先按照区间起始位置排序
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        // 遍历区间
        int[][] res = new int[intervals.length][2];
        int idx = -1;
        for (int[] interval : intervals) {
            // 如果结果数组是空的，或者当前区间的起始位置 > 结果数组中最后区间的终止位置，
            // 则不合并，直接将当前区间加入结果数组。
            if (idx == -1 || interval[0] > res[idx][1]) {
                res[++idx] = interval;
            } else {
                // 反之将当前区间合并至结果数组的最后区间
                res[idx][1] = Math.max(res[idx][1], interval[1]);
            }
        }
        return Arrays.copyOf(res, idx + 1);
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(arr);
    }

}


// public class No56Merge {
//     /**
//      *
//      * @param intervals 间隔
//      * @return
//      */
//     public static int[][] merge(int[][] intervals) {
//         int[][] newIntervals = new int[0][];
//         // 二维数组长度
//         int len = intervals.length;
//         int mostMin = 0;
//         int mostMax = 0;
//         int nextIndex = 0;
//         for (int i = 0; i < len; i++) {
//             int[] interval = intervals[i];
//             System.out.println(Arrays.toString(interval));
//             // 一维数组长度
//             int itemLen = interval[1] - interval[0];
//             System.out.println("itemLen:" + itemLen);
//             for (int j = 0; j <= itemLen; j++) {
//                 if (j == 0) {
//                     if (mostMin == 0 || mostMin > interval[0]) {
//                         mostMin = interval[0];
//                     }
//                 } else if (j == itemLen) {
//                     if (i == 0) {
//                         if (mostMax == 0 || mostMax < (interval[0] + j)) {
//                             mostMax = interval[0] + j;
//                         }
//                     } else {
//                         if (interval[0] < mostMax && (mostMax == 0 || mostMax < (interval[0] + j))) {
//                             mostMax = interval[0] + j;
//                         } else if (nextIndex == 0){
//                             // 下一次的起点
//                             nextIndex = i;
//                             System.out.println("nextIndex:" + nextIndex);
//                         }
//                     }
//                 }
//             }
//             System.out.println("min:" + mostMin);
//             System.out.println("max:" + mostMax);
//         }
//         return newIntervals;
//     }
//
//     public static void main(String[] args) {
//         int[][] arr = {{1,3}, {2,6}, {8,10}, {15,18}};
//         merge(arr);
//     }
//
// }
