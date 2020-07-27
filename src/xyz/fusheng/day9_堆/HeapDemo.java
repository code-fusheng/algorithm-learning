package xyz.fusheng.day9_堆;

import java.util.Arrays;

/**
 * @FileName: HeapDemo
 * @Author: code-fusheng
 * @Date: 2020/7/27 9:11
 * @version: 1.0
 * Description: 堆的源码分析
 */

public class HeapDemo {

    /**
     * 存储堆中元素的数组
     */
    private int[] data;
    /**
     * 堆中可存数据的最大个数
     */
    private int size;
    /**
     * 堆中已存元素的个数
     */
    private int count;

    /**
     * 利用初始容量狗构造存储堆元素的数组
     * @param capacity
     */
    public HeapDemo(int capacity) {
        this.data = new int[capacity + 1];
        this.size = capacity;
        this.count = 0;
    }

    @Override
    public String toString() {
        return "HeapDemo{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                ", count=" + count +
                '}';
    }

    /**
     * 向堆中插入元素 插入元素后还要满足堆的条件，这个过程叫做 【堆化】
     * 从上往下 / 从下往上
     */

    /**
     * 将数据存入堆中
     * @param data
     */
     public void insert(int data) {
         if (count >= size) {
             return;    // 堆已满
         }
         // 将数据存入
         this.data[++count] = data;
         // 堆化 : 自下而上堆化
         heapifyFromBottom2Top(this.data, count);
     }

    /**
     * 移除堆顶元素
     * @return
     */
    public int removeMax() {
        // 如果是大顶堆，数组下标为1的元素就是最大值
        int max = data[1];
        // 移除完成后要保证堆的完整性，需要找第二大的元素放到堆上
        // 1、将最后一个的元素直接放在堆顶，并减少数量
        data[1] = data[count--];
        // 2、堆化让其继续成为一个合格的堆 ------> 自上而下堆化
        heapifyFromTop2Bottom(data, 1, count);
        return max;
     }

    /**
     * 数组 data 堆化 自上而下
     * @param data
     * @param begin
     * @param end
     */
    private void heapifyFromTop2Bottom(int[] data, int begin, int end) {
        while (true) {
            // 定义最大值的下标
            int max = begin;
            // 比较当前结点与其左子结点，右子结点的大小关系，找出最大值
            if (2*begin <= end && data[max] < data[2*begin]) {
                max = 2*begin;
            }
            if (2*begin <= end && data[max] < data[2*begin + 1]) {
                max = 2*begin + 1;
            }
            if (begin == max) {
                break;
            }
            swap(data, begin, max);
            begin = max;
        }
    }

    /**
     * 数组 data 堆化 自下而上
     * @param data
     * @param end
     */
    private void heapifyFromBottom2Top(int[] data, int end) {
         int i = end;
         while ( i/2 > 0 && this.data[i/2] < this.data[i] ) {
             swap(this.data, i/2, i);
             i /=2;
         }
    }

    /**
     * 交换数组下标 i,j 元素
     * @param array
     * @param i
     * @param j
     */
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
