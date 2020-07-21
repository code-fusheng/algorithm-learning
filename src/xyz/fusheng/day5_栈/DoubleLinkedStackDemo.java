package xyz.fusheng.day5_栈;

/**
 * @FileName: LinkedStackDemo
 * @Author: code-fusheng
 * @Date: 2020/7/21 21:38
 * @version: 1.0
 * Description: 基于双向链表的链式实现
 */

public class DoubleLinkedStackDemo {
    /**
     * 栈大小
     */
    private int size;
    /**
     * 存储链表尾结点
     */
    private Node tail;

    public DoubleLinkedStackDemo() {
        this.tail = null;
    }

    /**
     * 入栈
     * @param data
     * @return
     */
    public boolean push(Object data) {
        Node newNode = new Node(tail, data, null);
        if (size > 0) {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
        return true;
    }

    /**
     * 出栈
     * @return
     */
    public Object pop() {
        if ((size - 1) < 0) {
            // 栈空
            return null;
        }
        Object data = tail.getData();
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        }
        size--;
        return data;

    }



    /**
     * 链表中维护的Node结点
     */
    class Node {
        /**
         * 前驱结点
         */
        public Node prev;
        /**
         * 结点数据
         */
        public Object data;
        /**
         * 后继结点
         */
        public Node next;

        public Node(Node prev, Object data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        public Object getData() {
            return data;
        }
    }

}
