package com.itheima.d2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // 批量添加数据
        Collections.addAll(names,"张三","李四","王五","张麻子");
        System.out.println(names);
        System.out.println(names);
        // 打算List集合中元素的顺序
        Collections.shuffle(names);
        System.out.println(names);
        // 对List中的元素升序排序
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);

        List<Student> students = new ArrayList<>();
        students.add(new Student("蜘蛛精",25,169.5));
        students.add(new Student("紫霞",23,169.6));
        students.add(new Student("紫霞",23,169.6));
        students.add(new Student("至尊宝",26,169.8));
//        students.add(new Student("牛魔王",23,169.7));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
        //
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });
        System.out.println(students);
    }
}
