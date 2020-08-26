package xyz.fusheng.leetcode;

/**
 * @FileName: No7IntegerReversal
 * @Author: code-fusheng
 * @Date: 2020/8/25 20:44
 * @version: 1.0
 * Description: No7 - 整数反转
 */

public class No7IntegerReversal {

    public static int integerReverse(int x) {
        int pushIn = 0;
        while (x != 0) {
            // 取余 从整数中取出的数 最低位 -> 最高位
            int pushOut = x % 10;
            // 除法
            x = x / 10;
            // 判断是否溢出 int 的取值范围
            // 反转后的整形数大于int的最大值 或者 反转后的值 满足int最大值的前 n-1 位数 且 最后一位（取余操作） > 7 说明有溢出
            if (pushIn > Integer.MAX_VALUE / 10 || (pushIn == Integer.MAX_VALUE / 10 && pushOut > 7)) {
                return 0;
            }
            if (pushIn < Integer.MIN_VALUE / 10 || (pushIn == Integer.MIN_VALUE / 10 && pushOut < -8)) {
                return 0;
            }
            // 赋值
            pushIn = pushIn * 10 + pushOut;
        }
        return pushIn;
    }

    public static void main(String[] args) {
        int intValue1 = 123;
        int intValue2 = -123;
        int intValue3 = 120;
        // System.out.println(123 / 10);    12
        // System.out.println(123 % 10);    3
        System.out.println(integerReverse(intValue3));
    }
}
