package xyz.fusheng.day5_栈;

/**
 * @FileName: ArrayStackDemo
 * @Author: code-fusheng
 * @Date: 2020/7/21 20:56
 * @version: 1.0
 * Description: 基于数组的顺序栈实现代码
 */

public class ArrayStackDemo {
    /**
     * 栈大小
     */
    private int size;
    /**
     * 默认栈容量
     */
    private int DEFAULT_CAPACITY = 10;
    /**
     * 栈数据
     */
    private Object[] elements;

    private int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    /**
     * 默认构造 创建大小为10的栈
     */
    public ArrayStackDemo() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * 通过指定大小创建栈
     * @param capacity
     */
    public ArrayStackDemo(int capacity) {
        elements = new Object[capacity];
    }

    /**
     * 入栈
     * @param element
     * @return
     */
    public boolean push(Object element) {
        try {
            checkCapacity(size + 1);
            elements[size++] = element;
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }

    /**
     * 检查栈容量是否还足够
     * @param i
     */
    private void checkCapacity(int minCapacity) {
        if(elements.length  - minCapacity < 0) {
            throw new RuntimeException("栈容量不够！");
        }
    }

    /**
     * 出栈
     * @return
     */
    public Object pop() {
        if(size <= 0) {
            return null;
        }
        Object obj = elements[size - 1];
        elements[--size] = null;
        return obj;
    }

    /**
     * 获取栈大小
     * @return
     */
    public int size() {
        return size;
    }

}
