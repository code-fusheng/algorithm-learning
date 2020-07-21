package xyz.fusheng.day5_栈;

/**
 * @FileName: SingleLinkedStackDemoTest
 * @Author: code-fusheng
 * @Date: 2020/7/21 21:58
 * @version: 1.0
 * Description: 基于单链表实现的栈的测试类
 */

public class SingleLinkedStackDemoTest {
    public static void main(String[] args) {
        SingleLinedStackDemo stackDemo = new SingleLinedStackDemo();
        for (int i = 0; i < 50; i++) {
            stackDemo.push(i + "");
            System.out.println("第" + (i + 1) + "次入栈，入栈的值为:" + i);
        }
        for (int i = 0; i < 20; i++) {
            Object pop = stackDemo.pop();
            System.out.println("取出的结果:" + pop);
        }
    }
}
