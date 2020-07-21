package xyz.fusheng.day5_栈;

/**
 * @FileName: ArrayStackDemoTest
 * @Author: code-fusheng
 * @Date: 2020/7/21 21:08
 * @version: 1.0
 * Description: 基于数组实现的顺序栈的测试类
 */

public class ArrayStackDemoTest {
    public static void main(String[] args) {
        ArrayStackDemo stackDemo = new ArrayStackDemo();
        for (int i = 0; i < 13; i++) {
            boolean push = stackDemo.push(i);
            System.out.println("第" + (i+1) + "次存储数据为:" + i + ",存储结果是:" + push);
        }
        for (int i= 0; i < 11; i++) {
            Object pop = stackDemo.pop();
            System.out.println("第" + (i+1) + "次弹出数据为:" + pop);
        }
    }
}
