package xyz.fusheng.day0_集合测试;

import java.util.*;

/**
 * @FileName: Test
 * @Author: code-fusheng
 * @Date: 2020/8/5 20:49
 * @version: 1.0
 * Description: 集合测试
 */

public class Test {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("X");

        // for (String str : list) {
        //     list.remove(str);
        // }

        // iterator 迭代器的使用
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            // 边遍历边修改 Collection 的唯一正确方式是使用 Iterator.remove() 方法
            iterator.remove();
        }



        // "fail-fast" 快速失败机制
        // Collection<String> collection = Collections.unmodifiableCollection(list);
        // 异常提示 java.lang.UnsupportedOperationException
        // collection.add("y");

        System.out.println(list.size());

    }
}

class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("X");
        // list to array
        // list.toArray();
        System.out.println(list.toArray());

        // array to list
        String[] array = new String[]{"X", "Y", "Z"};
        // Arrays.asList(array);
        System.out.println(Arrays.asList(array));
    }

}

class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("X");
        List<String> slist = Collections.synchronizedList(list);
        slist.add("Z");
        slist.add("H");

        for (int i = 0; i < slist.size(); i++ ) {
            System.out.println(slist.get(i));
        }
    }
}
