package xyz.fusheng.day7_散列表;

import javafx.print.Collation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @FileName: HashMapDemo
 * @Author: code-fusheng
 * @Date: 2020/7/31 20:59
 * @version: 1.0
 * Description: HashMap源码分析
 */

public class HashMapDemo {

    public static void main(String[] args) {
        // 创建 hashMap 对象，也就是创建一个 Map 容器 接口的引用变量指向实现类的对象 虽然默认为 16 但是最好指定初始容量
        HashMap<String, String> hashMap = new HashMap<String, String>(16);

        // 添加键值对元素
        hashMap.put("zhangsan", "zhang-hao");
        // 键相同-值不同 添加键相同的键值对元素时，后面添加的值会覆盖之前的值
        hashMap.put("zhangsan", "code-fusheng");
        // 键不同-值相同 添加值相同、键不同的键值对元素时，会保存同名的键值
        hashMap.put("fusheng", "code-fusheng");
        // PS: 值可以重复、键不能重复

        hashMap.put("chuge", "gonglin");
        hashMap.put("free", "liu");

        // hashMap 打印会以键值对展示对象
        System.out.println("==> 输出 hashMap 对象: ");
        System.out.println(hashMap);
        // 获取容器 hashMap 中所有的键，返回一个Set集合，可以使用迭代来进行输出
        Set<String> keys = hashMap.keySet();
        System.out.println("==> 输出 hashMap 中所有的键: ");
        keys.forEach(System.out::println);
        // 获取容器 hashMap 中所有的值，返回一个Collection接口的实现类
        Collection<String> values = hashMap.values();
        System.out.println("==> 输出 hashMap 中所有的值: ");
        values.forEach(System.out::println);
        // 获取 key 的同时，得到 key 对应的值
        System.out.println("==> (get(key)方法)输出 hashMap 的 key + value: ");
        // 用 String 类型的变量 key 来遍历 keys 容器
        for (String key : keys) {
            // hashMap.get(Object key) 返回的是指定的键所对应的值
            System.out.println("键:" + key + "---值:" + hashMap.get(key));
        }
        // 获取 hashMap 容器中键值对的个数
        System.out.println("==> 输出 hashMap 容器中键值对的个数:\n" + hashMap.size());
        // 判断 hashMap 容器是否为空
        System.out.println("==> 判断 hashMap 容器是否为空:\n" + hashMap.isEmpty());

        // hashMap.entrySet()
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        System.out.println("==> (map.entrySet()方法)输出 hashMap 的 key + value: ");
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("键:" + entry.getKey() + "---值:" + entry.getValue());
        }

        // 清空 hashMap
        hashMap.clear();
        System.out.println("==> 判断 hashMap 容器是否清空:\n" + hashMap.isEmpty());

    }





}
