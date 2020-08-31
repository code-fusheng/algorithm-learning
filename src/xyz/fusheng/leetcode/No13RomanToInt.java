package xyz.fusheng.leetcode;

/**
 * @FileName: No13RomanToInt
 * @Author: code-fusheng
 * @Date: 2020/8/31 23:55
 * @version: 1.0
 * Description: No.13 罗马数字转整数
 */

public class No13RomanToInt {

    // 1、罗马数字由 I,V,X,L,C,D,M 构成；
    public static int romanToInt(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            int num = getValue(s.charAt(i));
            // 当小值在大值的左边，则减小值，如 IV=5-1=4；
            if (preNum < num) {
                sum -= preNum;
            // 当小值在大值的右边，则加小值，如 VI=5+1=6；
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }

    private static int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        String test1 = "III";
        String test2 = "IV";
        String test3 = "IX";

        System.out.println(romanToInt(test2));
    }

}
