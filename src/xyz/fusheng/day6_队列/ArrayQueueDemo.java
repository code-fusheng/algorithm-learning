package xyz.fusheng.day6_队列;

import java.util.Arrays;

/**
 * @FileName: ArrayQueueDemo
 * @Author: code-fusheng
 * @Date: 2020/7/22 14:30
 * @version: 1.0
 * Description: 基于数组实现的顺序队列
 */

public class ArrayQueueDemo {
    /**
     * 存储数据的数组
     */
    private Object[] elements;
    /**
     * 队列大小
     */
    private int size;
    /**
     * 默认队列容量
     */
    private int DEFAULT_CAPACITY = 10;
    /**
     * 队列头指针
     */
    private int head;
    /**
     * 队列尾指针
     */
    private int tail;

    private int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    /**
     * 默认构造函数 初始化大小为 10 的队列
     */
    public ArrayQueueDemo() {
        elements = new Object[DEFAULT_CAPACITY];
        this.initPointer(0,0);
    }

    /**
     * 通过传入的容量大小创建队列
     * @param capacity
     */
    public ArrayQueueDemo(int capacity) {
        if (capacity<=0){
            throw  new RuntimeException("队列的初始容量有问题！");
        }
        elements = new Object[capacity];
        this.initPointer(0,0);
    }

    /**
     * 初始化队列头尾指针
     * @param head
     * @param tail
     */
    private void initPointer(int head, int tail) {
        this.head = head;
        this.tail = tail;
    }

    /**
     * 元素入队列
     * @param element
     * @return
     */
    public boolean enqueue(Object element) {
        ensureCapacityHelper();
        // 在尾指针处存入元素且尾指针后移
        elements[tail++] = element;
        // 队列元素个数 +1
        size++;
        return true;
    }

    /**
     * 元素出队列
     * @return
     */
    public Object dequeue() {
        if (head == tail) {
            // 队列中没有数据
            return null;
        }
        // 取出队列头的元素且头指针后移
        Object obj = elements[head++];
        // 队列中元素个数 -1
        size--;
        return obj;
    }

    private void ensureCapacityHelper() {
        // 尾指针已越过数组尾端
        if(tail == elements.length) {
            // 判断队列是否已经满，即判断数组中是否还有可用存储空间
            if (size < elements.length) {
                if (head == 0) {
                    // 扩容
                    grow(elements.length);
                } else {
                  // 进行数据搬移操作，将数组中的数据一次向前挪动直至顶部
                  for (int i = head; i < tail; i++) {
                      elements[i - head] = elements[i];
                  }
                  // 数据搬移完后重新初始化头尾指针
                  initPointer(0, tail - head);
                }
            }
        }
    }

    /**
     * 扩容
     * @param oldCapacity
     */
    private void grow(int oldCapacity) {
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - oldCapacity < 0) {
            newCapacity = DEFAULT_CAPACITY;
        }
        if (newCapacity - MAX_ARRAY_SIZE > 0) {
            newCapacity = hugeCapacity(newCapacity);
        }
        elements = Arrays.copyOf(elements, newCapacity);
    }

    private int hugeCapacity(int newCapacity) {
        return (newCapacity > MAX_ARRAY_SIZE) ? Integer.MAX_VALUE : newCapacity;
    }

    /**
     * 获取队列元素个数
     * @return
     */
    public int getSize() {
        return size;
    }
}
