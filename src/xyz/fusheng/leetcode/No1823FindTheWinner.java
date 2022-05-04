package xyz.fusheng.leetcode;

import java.util.ArrayDeque;

/**
 * @FileName: No1823FindTheWinner
 * @Author: code-fusheng
 * @Date: 2022/5/4 21:41
 * @Version: 1.0
 * @Description:
 */

public class No1823FindTheWinner {

    public static int findTheWinner(int n, int k) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            // 双端队列末尾插入元素
            queue.offer(i);
        }
        while (queue.size() > 1) {
            for (int i = 1; i < k; i++) {
                // 删除双端队列头部的值，插入到尾部
                queue.offer(queue.poll());
            }
            queue.pop();
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        System.out.println(findTheWinner(5, 2));
    }

}
