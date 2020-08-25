package xyz.fusheng.day6_队列;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @FileName: QueueDemo
 * @Author: code-fusheng
 * @Date: 2020/8/7 14:27
 * @version: 1.0
 * Description: 队列
 */

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("String");
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue.size());
    }
}
