package xyz.fusheng.day8_树;

import java.util.TreeSet;

/**
 * @FileName: TreeSetDemo
 * @Author: code-fusheng
 * @Date: 2020/8/2 16:53
 * @version: 1.0
 * Description: TreeSet 测试类
 */

public class TreeSetDemo {

    public static void main(String[] args) {

        // 创建 treeSet 对象 [有序]
        TreeSet<Integer> treeSet = new TreeSet<>();

        // 创建并添加元素
        treeSet.add(1);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(9);

        // 打印对象
        System.out.println(treeSet);
        // 查找元素
        System.out.println(treeSet.contains(1));
        // 删除元素
        treeSet.remove(1);
        System.out.println(treeSet.contains(1));

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());







    }





}
