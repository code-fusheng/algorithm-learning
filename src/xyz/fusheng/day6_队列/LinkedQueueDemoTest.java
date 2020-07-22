package xyz.fusheng.day6_队列;

/**
 * @FileName: LinkedQueueDemoTest
 * @Author: code-fusheng
 * @Date: 2020/7/22 15:12
 * @version: 1.0
 * Description:
 */

public class LinkedQueueDemoTest {
    public static void main(String[] args) {
        LinkedQueueDemo queue = new LinkedQueueDemo();
        System.out.println(queue.dequeue());
        queue.enqueue("test1");
        queue.enqueue("test2");
        queue.enqueue("test3");
        queue.enqueue("test4");
        queue.enqueue("test5");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue("test6");
        queue.enqueue("test7");
        queue.enqueue("test8");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
