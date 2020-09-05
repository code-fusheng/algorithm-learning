package xyz.fusheng.哔哩笔试; /**
 * @author: code-fusheng
 * @Date: 2020/9/4 19:43
 */

import java.util.Arrays;

/**
 * @FileName: CricleArray
 * @Author: code-fusheng
 * @Date: 2020/9/4 19:43
 * @version: 1.0
 * Description: 螺旋矩阵
 */

public class CircleArray {

    public static int[] initArray(int[][] matrix) {
         int m = matrix[0].length;
         int n = matrix.length;
        System.out.println(m);
        System.out.println(n);
        int[] result = new int[m*n];
        initLayoutArray(matrix, m, n);


        return result;
    }

    public static int[] initLayoutArray(int[][] arr, int row, int col){
        int[] topArr = new int[row];
        int[] rightArr = new int[col-2];
        int[] bottomArr = new int[row];
        int[] lightArr = new int[col-2];
        int[] layoutArr = new int[(row + col - 2)*2];

        for (int i = 0; i < row; i++) {
            topArr[i] = arr[0][i];
            bottomArr[i] = arr[col-1][col-i];
        }
        for (int i= 0; i < col; i++) {
            rightArr[i] = arr[i][row-1];
            lightArr[i] = arr[row-1-i][0];
        }
        String layoutStr = topArr.toString() + rightArr.toString() + bottomArr.toString() + lightArr.toString();
        return layoutArr;
    }

    public static void main(String[] args) {

        int[][] matrix1 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        initArray(matrix1);
    }

}
