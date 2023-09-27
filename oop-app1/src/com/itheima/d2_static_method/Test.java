package com.itheima.d2_static_method;



public class Test {
    public static void main(String[] args) {
        // 掌握有无static修饰方法的用法
        // 1、类方法
        // 类名.类方法（推荐）
        Student.printHelloWorld();

        Student s = new Student();

        // 对象.实例方法
        s.printHelloWorld();

        s.printPass();
    }
}
