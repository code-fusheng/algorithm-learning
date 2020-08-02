package xyz.fusheng.day7_散列表;

import java.util.HashSet;
import java.util.Set;

/**
 * @FileName: hashSetDemo
 * @Author: code-fusheng
 * @Date: 2020/8/2 14:05
 * @version: 1.0
 * Description: HashSetDemo
 */

public class HashSetDemo {
    public static void main(String[] args) {
        // 创建 hashSet 集合对象 [无序、唯一]
        HashSet<String> hashSet = new HashSet<>();

        // 创建并添加元素
        hashSet.add("Monday");
        hashSet.add("Tuesday");
        hashSet.add("Wednesday");
        hashSet.add("Thursday");
        hashSet.add("Friday");
        hashSet.add("Saturday");
        hashSet.add("Sunday");
        hashSet.add("Sunday");

        // 打印对象
        System.out.println(hashSet);

        // 增强 for
        for (String s : hashSet) {
            System.out.println(s);
        }

        boolean isSunday = hashSet.contains("Sunday");
        System.out.println(isSunday);

        hashSet.remove("Sunday");
        System.out.println(hashSet.contains("Sunday"));

    }
}
