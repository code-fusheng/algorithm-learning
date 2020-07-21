package xyz.fusheng.day5_栈;

import java.util.Stack;

/**
 * @FileName: JdkStackDemo
 * @Author: code-fusheng
 * @Date: 2020/7/20 20:25
 * @version: 1.0
 * Description: JdkStack 源码分析
 */

public class JdkStackDemo {
    public static void main(String[] args) {
        // 创建栈对象
        Stack stack = new Stack();
        // 数据入栈
        stack.push("code");
        stack.push("fusheng");
        // 数据出栈
        Object o1 = stack.pop();
        System.out.println(o1);
        // 判断栈是否为空
        boolean isEmpty = stack.empty();
        System.out.println(isEmpty);
        // 栈底向栈顶方向遍历，查找指定对象 o 在栈中的位置
        int searchIndex = stack.search("code");
        System.out.println(searchIndex);
    }
}
