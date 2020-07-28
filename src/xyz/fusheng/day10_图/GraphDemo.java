package xyz.fusheng.day10_图;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @FileName: GraphDemo
 * @Author: code-fusheng
 * @Date: 2020/7/28 21:52
 * @version: 1.0
 * Description: 基于邻接表 图的实现
 */

public class GraphDemo {
    /**
     * 图中顶点的个数
     */
    private int points;

    /**
     * 邻接表：有点儿类似于散列表，数组的每个槽位链表头结点存储的是图中的顶点，链表其他结点存储的是与该节点相连的顶点
     */
    private LinkedList<Integer>[] adjacencyList;

    public GraphDemo(int points) {
        this.points = points;
        // 初始化数组
        adjacencyList = new LinkedList[this.points];
        // 初始化数组每个槽位上的链表
        for (int i = 0; i < this.points; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    /**
     * 向图中添加顶点（边）
     * @param s
     * @param t
     */
    public void addEdge(int s, int t) {
        // 无向图，一条边存储两回；PS：在demo中，无向图中存储的顶点的值和数组的下标值保持对应
        adjacencyList[s].add(t);
        adjacencyList[t].add(s);
    }
}
