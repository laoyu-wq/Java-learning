package com.itheima.d8_stream;

import com.itheima.d6_map_impl.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("蜘蛛精",26,172.5);
        Student s2 = new Student("蜘蛛精",26,172.5);
        Student s3 = new Student("紫霞",23,167.6);
        Student s4 = new Student("白晶晶",25,169.0);
        Student s5 = new Student("牛魔王",35,183.3);
        Student s6 = new Student("牛夫人",34,168.5);
        Collections.addAll(students,s1,s2,s3,s4,s5,s6);

        long size = students.stream().filter(s -> s.getHeight() > 168).count();
        System.out.println(size);

        Student s = students.stream().max((o1, o2) -> Double.compare(o1.getHeight() , o2.getHeight())).get();
        System.out.println(s);

        Student ss = students.stream().min((o1, o2) -> Double.compare(o1.getHeight() , o2.getHeight())).get();
        System.out.println(ss);

        // 注意：流只能收集一次
        Stream<Student> studentStream = students.stream().filter(a -> a.getHeight() > 170);
        List<Student> students1 = studentStream.collect(Collectors.toList());
        System.out.println(students1);

        Set<Student> students2 = students.stream().filter(a -> a.getHeight() > 170).collect(Collectors.toSet());
        System.out.println(students2);

        Map<String, Double> map =
                students.stream().filter(a -> a.getHeight() > 170)
                        .distinct()//先去重
                        .collect(Collectors.toMap(a -> a.getName(), a -> a.getHeight()));

        Object[] arr = students.stream().filter(a -> a.getHeight() > 170).toArray();
//        Student[] arr = students.stream().filter(a -> a.getHeight() > 170).toArray(len -> new Student[len]);
        System.out.println(Arrays.toString(arr));
    }
}
