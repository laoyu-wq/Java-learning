package com.itheima.d8_stream;

import com.itheima.d6_map_impl.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores,88.5,100.0,60.0,99.0,9.5,99.6,25.0);
        // 找出成绩大于等于60分的数据，并升序后，再输出
        scores.stream().filter(s -> s >= 60).sorted().forEach(s -> System.out.println(s));

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("蜘蛛精",26,172.5);
        Student s2 = new Student("蜘蛛精",26,172.5);
        Student s3 = new Student("紫霞",23,167.6);
        Student s4 = new Student("白晶晶",25,169.0);
        Student s5 = new Student("牛魔王",35,183.3);
        Student s6 = new Student("牛夫人",34,168.5);
        Collections.addAll(students,s1,s2,s3,s4,s5,s6);

        students.stream().filter(s -> s.getAge() >= 23 && s.getAge() <= 30)
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .forEach(s -> System.out.println(s));

//        students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()))
//                .limit(3).forEach(s -> System.out.println(s));
        students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()))
                .limit(3).forEach(System.out::println);//limit获取前几个元素

        students.stream().filter(s -> s.getHeight() > 168).map(s -> s.getName()).distinct().forEach(System.out::println);//distinct去重
        students.stream().filter(s -> s.getHeight() > 168).distinct().forEach(System.out::println);//distinct去重

        Stream<String> st1 = Stream.of("张三","李四");
        Stream<String> st2 = Stream.of("张三2","李四2","王五");
        Stream<String> allSt = Stream.concat(st1,st2);
        allSt.forEach(System.out::println);
    }
}
