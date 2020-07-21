package xyz.fusheng.day5_栈;

/**
 * @FileName: SingleLinedStackDemo
 * @Author: code-fusheng
 * @Date: 2020/7/21 21:50
 * @version: 1.0
 * Description: 基于单链表的链式实现
 */

public class SingleLinedStackDemo {
    /**
     * 存储链表头结点
     */
    private Node head;

    public SingleLinedStackDemo() {
        this.head = null;
    }

    /**
     * 入栈
     * @param data
     * @return
     */
    public boolean push(Object data) {
        Node newNode = new Node(data, head);
        head = newNode;
        return true;
    }

    public Object pop() {
        if (head == null) {
            return null;
        }
        Node topNode = head;
        head = topNode.next;
        topNode.next = null;
        return topNode.data;
    }

    /**
     * 结点对象
     */
    class Node {
        /**
         * 结点数据
         */
        private Object data;
        /**
         * next 指针
         */
        private Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Object getData() {
            return data;
        }
    }

}
