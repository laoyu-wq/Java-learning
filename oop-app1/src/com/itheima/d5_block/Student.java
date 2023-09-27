package com.itheima.d5_block;

public class Student {
    static int number = 80;
    static String schoolName;
    // 静态代码块
    // 静态代码块在类加载时自动执行，由于类只会执行一次，所以静态代码块也只执行一次
    static {
        System.out.println("静态代码块执行~~");
        schoolName = "黑马";
    }

    int age;
    // 实例代码块
    {
        System.out.println("实例代码块执行了~~");
        age = 18;
        System.out.println("有人创建了对象" + this);
    }

    public Student() {
        System.out.println("无参构造器");
    }
    public Student(String name){
        System.out.println("有参构造器");
    }
}
