package com.itheima.d1_polymorphism;

public class Test {
    public static void main(String[] args) {
        People p1 = new Teacher();// 识别技巧：编译看左边，运行看右边
        p1.run();// 对于变量：编译看左边，运行看左边
        System.out.println(p1.name);
        People p2 = new Student();
        p2.run();
        System.out.println(p2.name);
    }
}
