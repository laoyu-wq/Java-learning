package com.itheima.d7_method_references;

import com.itheima.d5_arrays.Student;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精",169.5,23);
        students[1] = new Student("紫霞",163.8,26);
        students[2] = new Student("紫霞",163.8,26);
        students[3] = new Student("至尊宝",167.5,24);

//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                // 制定比较规则
////                if (o1.getHeight() > o2.getHeight())
////                    return 1;
////                else if (o1.getHeight() < o2.getHeight()) {
////                    return -1;
////                }
////                return 0;
//                return Double.compare(o1.getHeight(), o2.getHeight());// 升序
//            }
//        });

        // Lambda简化后的形式
//        Arrays.sort(students,(o1,o2) -> o1.getAge() - o2.getAge());
//        Arrays.sort(students,(o1,o2) -> CompareByData.compareByAge(o1,o2));
        // 静态方法引用
//        Arrays.sort(students,CompareByData::compareByAge);

        // 实例方法引用
        CompareByData compare = new CompareByData();
//        Arrays.sort(students,((o1, o2) -> compare.compareByAgeDesc(o1,o2)));
        Arrays.sort(students,compare::compareByAgeDesc);

        System.out.println(Arrays.toString(students));
    }
}
