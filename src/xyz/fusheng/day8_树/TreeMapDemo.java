package xyz.fusheng.day8_树;

import java.util.Map;
import java.util.TreeMap;

/**
 * @FileName: TreeMapDemo
 * @Author: code-fusheng
 * @Date: 2020/8/1 15:55
 * @version: 1.0
 * Description: TreeMap 源码分析
 */

public class TreeMapDemo {

    public static void main(String[] args) {

        // 创建 treeMap 集合对象 对比测试 treeMap 有序
        TreeMap<String, String> treeMap1 = new TreeMap<>();
        // 向集合中添加元素
        treeMap1.put("Monday", "星期一");
        treeMap1.put("Tuesday", "星期二");
        treeMap1.put("Wednesday", "星期三");
        treeMap1.put("Thursday", "星期四");
        treeMap1.put("Friday", "星期五");
        treeMap1.put("Saturday", "星期六");
        treeMap1.put("Sunday", "星期天");

        System.out.println(treeMap1);

        // 创建 treeMap 集合对象 对比测试 treeMap 有序
        TreeMap<String, String> treeMap2 = new TreeMap<>();
        // 向集合中添加元素 这里构造的时候选的 String 类型参数
        treeMap2.put("1", "星期一");
        treeMap2.put("2", "星期二");
        treeMap2.put("3", "星期三");
        treeMap2.put("4", "星期四");
        treeMap2.put("5", "星期五");
        treeMap2.put("6", "星期六");
        treeMap2.put("7", "星期天");

        System.out.println(treeMap2);

        String getValue = treeMap2.get("1");
        System.out.println(getValue);

        String removeValue = treeMap2.remove("7");
        System.out.println(removeValue);

        System.out.println(treeMap2);
    }
}
