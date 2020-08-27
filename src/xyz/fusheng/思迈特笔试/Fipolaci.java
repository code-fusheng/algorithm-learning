package xyz.fusheng.思迈特笔试;

/**
 * @FileName: FBLQ
 * @Author: code-fusheng
 * @Date: 2020/8/26 19:02
 * @version: 1.0
 * Description: 斐波拉契
 */

public class Fipolaci {

    public static int fipolaci(int k) {
        int result = 0;
        int first = 1;
        int second = 1;
        for (int i = 1; i <= k; i ++ ) {
            if (i == 1) {
                result = 1;
            } else if (i == 2) {
                result = 1;
            } else {
                result = first + second;
                first = second;
                second = result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fipolaci(19));
    }

}
