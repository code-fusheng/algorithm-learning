package xyz.fusheng.day3_数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @FileName: ArrayListDemo
 * @Author: code-fusheng
 * @Date: 2020/7/19 11:55
 * @version: 1.0
 * Description: ArrayList源码解析
 */

public class ArrayListDemo {
    public static void main(String[] args) {
        /**
         * 创建 ArrayList 数组对象
         */
        List<String> list = new ArrayList<String>();
        /**
         * add()方法
         */
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        /**
         * 往集合中添加第11个元素,默认数组容量为10.此时需要进行扩容
         * 调用 grow() 方法
         */
        list.add("k");
        list.forEach(System.out::println);

        // get() 方法
        Object o1 = list.get(0);
        System.out.println(o1);
        list.forEach(System.out::println);

        // set() 方法
        list.set(0, "aaa");
        Object o2 = list.get(0);
        System.out.println(o2);
        list.forEach(System.out::println);

        // remove() 方法 6 : "g"
        list.remove(6);
        list.forEach(System.out::println);

        /**
         * indexOf() 方法
         * 返回此列表中指定元素的第一个出现项的索引，如果该列表不包含该元素，则返回-1。
         */
        int indexNum =  list.indexOf("c");
        System.out.println(indexNum);

        /**
         * lastIndexOf()
         * 返回此列表中指定元素的最后一次出现的索引，如果该列表不包含该元素，则返回-1。
         */
        int lastIndexNum = list.lastIndexOf("c");
        System.out.println(lastIndexNum);

        // clear() 方法
        list.clear();
        list.forEach(System.out::println);

    }
}
