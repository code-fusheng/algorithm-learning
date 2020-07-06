package xyz.fusheng.day2_时间空间复杂度;

import java.util.Arrays;

/**
 * @FileName: SCQuestion1
 * @Author: code-fusheng
 * @Date: 2020/7/6 11:41
 * @version: 1.0
 * Description: 空间复杂度问题1
 */

public class SCQuestion1 {
    /****************Start**********************/
    public static int[] reverse1(int[] arr) {
        int n=arr.length;
        int temp;
        for (int start=0, end=n-1; start<=end; start++, end--) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        return arr;
    }
    /*****************End**********************/
    /****************Start**********************/
    public static int[] reverse2(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = n -1; i >= 0; i--) {
            temp[n-1-i] = arr[i];
        }
        return temp;
    }
    /*****************End**********************/
    public static void main(String[] args) {
        int[] oldArr = new int[]{1, 2, 3, 4, 5, 6, 7 ,8 ,9 ,10};
        System.out.println("Change After:" + Arrays.toString(oldArr));
        int[] newArr1 = reverse1(oldArr);
        System.out.println("Change Before:" + Arrays.toString(newArr1));
        int[] newArr2 = reverse2(oldArr);
        System.out.println("Change Before:" + Arrays.toString(newArr2));
    }
}
