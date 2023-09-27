package com.itheima.d4_static_attention;

public class Student {
    static String schoolName; //类变量
    double score;

    // 1、类方法中可以直接访问类的成员，不可以直接访问实例成员
    public static void printHelloWorld(){
        schoolName = "黑马";
        printHelloWorld2();
//        System.out.println(score);
//        System.out.println(this);
    }

    // 类方法
    public static void printHelloWorld2(){}

    // 2、实例方法中既可以直接访问类成员，也可以直接访问实例变量
    // 实例方法
    public void printPass(){
        schoolName = "黑马2";
        printHelloWorld2();
        System.out.println(score);
        printPass2();

        System.out.println(this);
    }
    public void printPass2(){}

}
