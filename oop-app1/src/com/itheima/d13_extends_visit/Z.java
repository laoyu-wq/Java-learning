package com.itheima.d13_extends_visit;

public class Z extends F{
    String name = "子类名称";
    public void showName(){
        String name = "局部名称";
        // 就近原则
        System.out.println(name);       // 局部名称
        System.out.println(this.name);  // 子类
        System.out.println(super.name); // 父类
    }

    @Override
    public void print1(){
        System.out.println("==子类的print1方法执行==");
    }

    public void showMethod(){
        print1();
        super.print1();
    }
}
