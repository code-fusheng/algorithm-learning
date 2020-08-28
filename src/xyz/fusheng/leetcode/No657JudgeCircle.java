package xyz.fusheng.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @FileName: No657JudgeCircle
 * @Author: code-fusheng
 * @Date: 2020/8/28 23:49
 * @version: 1.0
 * Description: No.657 判断机器人是否返回原点
 */

public class No657JudgeCircle {

    public static boolean judgeCircle(String moves) {
        int countRL = 0;
        int countUD = 0;
        for (int i= 0; i < moves.length(); i ++ ) {
            char k = moves.charAt(i);
            switch (k) {
                case 'R':
                    countRL++;
                    break;
                case 'L':
                    countRL--;
                    break;
                case 'U':
                    countUD++;
                    break;
                case 'D':
                    countUD--;
                    break;
                default:
                    break;
            }
        }
        if (countRL == 0 && countUD == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String in1 = "UD";
        String in2 = "LL";
        System.out.println(judgeCircle(in2));
    }

}
