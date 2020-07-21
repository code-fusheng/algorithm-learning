package xyz.fusheng.day5_栈;

/**
 * @FileName: DoubleLinkedStackDemoTest
 * @Author: code-fusheng
 * @Date: 2020/7/21 22:13
 * @version: 1.0
 * Description: 基础双向链表实现的栈的测试类
 */

public class DoubleLinkedStackDemoTest {
    public static void main(String[] args) {
        DoubleLinkedStackDemo stackDemo = new DoubleLinkedStackDemo();
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
