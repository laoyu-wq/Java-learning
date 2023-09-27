package com.itheima.d2_polymorphism;

public class Teacher extends People {
    public String name = "子类Teacher的名称";
    @Override
    public void run(){
        System.out.println("老师");
    }
    public void teach(){
        System.out.println("teach");
    }
}
