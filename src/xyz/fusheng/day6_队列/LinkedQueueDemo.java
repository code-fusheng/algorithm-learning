package xyz.fusheng.day6_队列;

/**
 * @FileName: LinkedQueueDemo
 * @Author: code-fusheng
 * @Date: 2020/7/22 15:09
 * @version: 1.0
 * Description: 基于链表的链式队列
 */

public class LinkedQueueDemo {

    /**
     * 队列元素个数
     */
    private int size;
    private  Node head;
    private  Node tail;

    public  LinkedQueueDemo(){
        this.head=null;
        this.tail =null;
    }

    /**
     * 入队
     * @param element
     * @return
     */
    public  boolean  enqueue(Object element){
        Node node = new Node(element,null);
        if(tail==null){
            tail = node;
            head = node;
        }else {
            tail.next= node;
            tail =node;
        }
        size++;
        return  true;
    }

    /**
     * 出队
     * @return
     */
    public  Object dequeue(){
        if (head==null){
            return null;
        }
        Object data = head.data;
        head =head.next;
        if(head==null){
            tail =null;
        }
        size--;
        return  data;
    }

    /**
     * 链表的节点定义完毕
     */
    static  class  Node{
        private  Object  data;
        private Node next;

        public  Node ( Object data ,Node next){
            this.data = data;
            this.next = next;
        }
    }

}
