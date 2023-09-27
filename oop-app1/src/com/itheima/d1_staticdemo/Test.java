package com.itheima.d1_staticdemo;

public class Test {
    public static void main(String[] args) {
        // 目标：掌握有无static修饰成员变量的用法，特点

        // 1、类变量用法
        // 类名.类变量（推荐）
        Student.name = "圆滑";

        Student s1 = new Student();
        s1.name = "马冬梅";

        Student s2 = new Student();
        s2.name = "秋雅";

        System.out.println(s1.name);

        // 2、实例变量的用法
        s1.age = 23;
        s2.age = 18;
        System.out.println(s1.age);
    }
}
