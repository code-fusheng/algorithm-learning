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
     * 记录是否找到目标
     */
    private boolean found = false;

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

    /**
     * 从源顶点到目标顶点的广度优先搜索算法 BFS
     * @param source
     * @param target
     */
    public void bfs(int source, int target) {
        if (source == target) {
            return;
        }
        // 定义一个 boolean 数组记录顶点是否被访问过
        boolean[] visited = new boolean[this.points];
        visited[source] = true;
        // 定义一个队列，BFS算法借助了一个队列
        Queue<Integer> queue = new LinkedList<>();
        // 将源顶点加入队列
        queue.add(source);
        // 定义一个数组，记录从源顶点到目标顶点之间的路线
        int[] prev = new int[this.points];
        for (int i = 0; i < prev.length; i++) {
            prev[i] = -1;
        }
        while (!queue.isEmpty()) {
            // 取出队列中的顶点元素
            Integer p = queue.poll();
            // 从邻接表中取出跟该顶点相连的顶点链表
            for (int j = 0; j < adjacencyList[p].size(); j++) {
                // 依次取出跟顶点 p 相连的顶点 p_connect
                Integer p_connect = adjacencyList[p].get(j);
                if (!visited[p_connect]) {
                    // 记录 p_connect 之前的顶点是 p
                    prev[p_connect] = p;
                    // 判断跟顶点 p 相连的顶点 p_connect 是否是目标顶点
                    if (p_connect == target) {
                        // 打印从源顶点到目标顶点之间的线路
                        print(prev, source, target);
                        return;
                    }
                    // 标识顶点 p 已经被访问
                    visited[p] = true;
                    // 将顶点 p 相连的顶点 p_connect 加入队列
                    queue.add(p_connect);
                }
            }
        }
    }

    /**
     * 递归打印从 s -> t 之间的线路
     * @param prev
     * @param s
     * @param t
     */
    private void print(int[] prev, int s, int t) {
        if (prev[t] != -1 && s != t) {
            print(prev, s, prev[t]);
        }
        System.out.println(t + "->");
    }

    public void dfs(int source, int target) {
        if (source == target) {
            return;
        }
        // 定义一个 boolean 数组记录顶点是否被访问过
        boolean[] visited = new boolean[this.points];
        visited[source] = true;
        // 定义一个数组，记录从源顶点到目标顶点之间的线路
        int[] prev = new int[this.points];
        for (int i = 0; i < prev.length; i++) {
            prev[i] = -1;
        }
        // 递归调用
        recurDFS(source, target, visited, prev);
        // 打印线路
        print(prev, source, target);
    }

    /**
     * 递归的查找顶点 p 到目标顶点之间的路线图
     * @param source
     * @param target
     * @param visited
     * @param prev
     */
    private void recurDFS(int source, int target, boolean[] visited, int[] prev) {
        if (found) {
            return;
        }
        // 标记当前顶点已经被访问
        visited[points] = true;
        // 如果当前顶点就是目标顶点
        if (points == target) {
            found = true;
            return;
        }
        // 获取与当前顶点相连的所有顶点
        for (int j = 0; j < adjacencyList[points].size(); j++) {
            // 获取与顶点 p 相连的顶点
            Integer p_connect = adjacencyList[points].get(j);
            if (!visited[p_connect]) {
                // 记录 p_connect 之前的顶点是 p
                prev[p_connect] = points;
                // 递归的去找与 p_connect 相连的顶点
                recurDFS(p_connect, target, visited, prev);
            }
        }
    }
}
