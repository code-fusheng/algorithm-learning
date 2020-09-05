package xyz.fusheng.哔哩笔试; /**
 * @author: code-fusheng
 * @Date: 2020/9/4 19:18
 */

/**
 * @FileName: LongestArray
 * @Author: code-fusheng
 * @Date: 2020/9/4 19:18
 * @version: 1.0
 * Description: 最长子串
 */

public class LongestArray {

    public static int countLongArray(int[] arr, int k) {
        int bestCount = 0;
        int count = 0;
        int right = 0;
        int left = 0;
        if (k >= arr.length) {
            bestCount = arr.length;
            return bestCount;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > bestCount) {
                    bestCount = count;
                }
            } else {
                right++;
                count = 0;
            }
        }
        return bestCount + k;
    }


    public static void main(String[] args) {

        int[] arr1 = {1,1,1,0,0,0,1,1,1,1,0};
        int k1 = 2;

        int[] arr2 = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k2 = 3;

        countLongArray(arr1, k1);
    }


}
