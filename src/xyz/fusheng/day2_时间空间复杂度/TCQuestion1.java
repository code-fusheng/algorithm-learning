package xyz.fusheng.day2_时间空间复杂度;

/**
 * @FileName: TCQuestion1
 * @Author: code-fusheng
 * @Date: 2020/7/6 11:34
 * @version: 1.0
 * Description: 时间复杂度问题1
 */

public class TCQuestion1 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 100;
        for(int i= 1; i <= n; i++) {
            for (int j= 1; j <= n; j++) {
                sum += i;
            }
        }
        System.out.println("sum=" +sum);
    }
}
