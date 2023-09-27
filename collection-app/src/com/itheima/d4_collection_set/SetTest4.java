package com.itheima.d4_collection_set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest4 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(6);
        set1.add(5);
        set1.add(5);
        set1.add(7);
        System.out.println(set1);

//        Set<Student> students = new TreeSet<>();
        Set<Student> students = new TreeSet<>(( o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight()));
//        Set<Student> students = new TreeSet<>(
//                new Comparator<Student>() {
//                    @Override
//                    public int compare(Student o1, Student o2) {
//                        return Double.compare(o1.getHeight(), o2.getHeight());
//                    }
//                }
//        );
        students.add(new Student("蜘蛛精",25,169.5));
        students.add(new Student("紫霞",23,169.6));
        students.add(new Student("至尊宝",26,169.8));
        students.add(new Student("牛魔王",23,169.7));
        System.out.println(students);
    }
}
