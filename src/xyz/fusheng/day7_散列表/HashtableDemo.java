package xyz.fusheng.day7_散列表;

import java.util.Hashtable;

/**
 * @FileName: HashtableDemo
 * @Author: code-fusheng
 * @Date: 2020/7/23 15:55
 * @version: 1.0
 * Description: Hashtable 源码分析
 */

public class HashtableDemo {
    public static void main(String[] args) {

        /**
         * 新建对象
         */
        Hashtable hashtable = new Hashtable();
        /**
         * 初始添加
         */
        hashtable.put("1", "a");
        hashtable.put("2", "b");
        hashtable.put("3", "c");
        hashtable.put("4", "d");
        hashtable.put("5", "e");
        hashtable.put("6", "f");
        hashtable.put("7", "g");
        hashtable.put("8", "h");
        hashtable.put("9", "i");
        hashtable.put("10", "j");
        hashtable.put("11", "k");
        hashtable.put("12", "l");
        /**
         * 测试添加 key 相同 value 不同
         */
        hashtable.put("11","x");
        /**
         * 测试添加 key 不相同 value 相同
         */
        hashtable.put("13","a");

        /**
         * get() 取数据方法测试
         * 11 --> x
         * 13 --> a
         */
        System.out.println(hashtable.get("11"));
        System.out.println(hashtable.get("13"));
    }
}
