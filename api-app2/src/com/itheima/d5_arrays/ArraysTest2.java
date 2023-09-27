package com.itheima.d5_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest2 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精",169.5,23);
        students[1] = new Student("紫霞",163.8,26);
        students[2] = new Student("紫霞",163.8,26);
        students[3] = new Student("至尊宝",167.5,24);

        // 1、public static void sort(类型[] arr)
//        Arrays.sort(students);

        // 2、public static <T> void sort(T[] arr,Comparator<? super T>c)
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 制定比较规则
//                if (o1.getHeight() > o2.getHeight())
//                    return 1;
//                else if (o1.getHeight() < o2.getHeight()) {
//                    return -1;
//                }
//                return 0;
                return Double.compare(o1.getHeight(), o2.getHeight());// 升序
            }
        });
        System.out.println(Arrays.toString(students));


    }
}
