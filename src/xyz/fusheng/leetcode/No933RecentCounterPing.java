package xyz.fusheng.leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @FileName: No933RecentCounterPing
 * @Author: code-fusheng
 * @Date: 2022/5/6 06:32
 * @Version: 1.0
 * @Description: No.933 最近的请求
 */

public class No933RecentCounterPing {

    Queue<Integer> queue;

    public No933RecentCounterPing() {
        queue = new ArrayDeque<Integer>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }

    public static void main(String[] args) {

    }

}
