package xyz.fusheng.day4_链表;

import java.util.LinkedList;
import java.util.List;

/**
 * @FileName: LinkedListDemo
 * @Author: code-fusheng
 * @Date: 2020/7/20 12:29
 * @version: 1.0
 * Description: LinkedList 源码分析
 */

public class LinkedListDemo {
    public static void main(String[] args) {
        /**
         * 创建 LinkedList 对象
         */
        List<String> list = new LinkedList<>();

        /**
         * 主要方法源码分析
         */
        /**
         * add() 方法  初次添加
         */
        list.add("a");
        list.add("b");

        list.forEach(System.out::print);
        System.out.println();


        /**
         * get() 方法
         */
        String s = list.get(0);
        System.out.println(s);


        /**
         * add() 方法
         */
        list.add("h");
        list.forEach(System.out::print);
        System.out.println();

        /**
         * remove(int index) 删除指定索引处的元素
         */
        list.remove(1);
        list.forEach(System.out::print);
        System.out.println();

    }
}
