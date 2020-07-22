package xyz.fusheng.day6_队列;

/**
 * @FileName: ArrayQueueDemoTest
 * @Author: code-fusheng
 * @Date: 2020/7/22 14:54
 * @version: 1.0
 * Description: 顺序队列测试类
 */

public class ArrayQueueDemoTest {
    public static void main(String[] args) {
        ArrayQueueDemo queueDemo = new ArrayQueueDemo(5);
        // 入队列
        queueDemo.enqueue("test1");
        queueDemo.enqueue("test2");
        queueDemo.enqueue("test3");
        queueDemo.enqueue("test4");
        queueDemo.enqueue("test5");
        // 此时入队时，执行扩容逻辑
        queueDemo.enqueue("test6");
        // 元素出队列
        System.out.println(queueDemo.dequeue());
        System.out.println(queueDemo.dequeue());
        System.out.println(queueDemo.dequeue());
        System.out.println(queueDemo.dequeue());
        System.out.println(queueDemo.dequeue());
        System.out.println(queueDemo.dequeue());
        // 为空
        // System.out.println(queueDemo.dequeue());
    }
}
