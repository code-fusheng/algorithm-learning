package xyz.fusheng.day8_树;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @FileName: TreeMapDemo2
 * @Author: code-fusheng
 * @Date: 2020/8/1 21:04
 * @version: 1.0
 * Description: TreeMap 测试类
 */

public class TreeMapDemo2 {

    public static void main(String[] args) {


        // 创建集合对象
        // 排序方式需要显示给出，匿名内部类的方式给出排序比较器 Comparator
        TreeMap<Student, String> treeMap = new TreeMap<>(
                new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        // 主要条件
                        int num = s1.getAge() - s2.getAge();
                        // 次要条件
                        int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                        return num2;
                    }
                }
        );

        Student s1 = new Student("潘安", 30);
        Student s2 = new Student("柳下惠", 35);
        Student s3 = new Student("唐伯虎", 33);
        Student s4 = new Student("燕青", 32);

        // 存储元素
        treeMap.put(s1, "宋朝");
        treeMap.put(s2, "元朝");
        treeMap.put(s3, "明朝");
        treeMap.put(s4, "清朝");

        // 遍历
        Set<Student> set = treeMap.keySet();
        for (Student key : set) {
            String value = treeMap.get(key);
            System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
        }

    }

    static class Student{
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
