package xyz.fusheng.day5_栈;

/**
 * @FileName: ArrayStackDemo1Test
 * @Author: code-fusheng
 * @Date: 2020/7/21 21:08
 * @version: 1.0
 * Description: 基于数组实现的顺序栈的测试类(支持扩容)
 */

public class ArrayStackDemo1Test {
    public static void main(String[] args) {
        ArrayStackDemo1 stackDemo1 = new ArrayStackDemo1();
        for (int i = 0; i < 40; i++) {
            boolean push = stackDemo1.push(i);
            System.out.println("第" + (i+1) + "次存储数据为:" + i + ",存储结果是:" + push);
        }
        for (int i = 0; i < 11; i++) {
            Object pop = stackDemo1.pop();
            System.out.println("第" + (i+1) + "次弹出数据为:" + pop);
        }
    }
}
