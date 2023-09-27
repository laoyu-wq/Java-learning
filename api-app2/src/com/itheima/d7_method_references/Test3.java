package com.itheima.d7_method_references;

public class Test3 {
    public static void main(String[] args) {
        // 1、创建这个接口的匿名内部类对象
//        Creator cc = new Creator() {
//            @Override
//            public Car create(String name, double price) {
//                return new Car(name,price);
//            }
//        };
        Creator cc = (  name,   price) -> new Car(name,price);
        cc.create("奔驰",49.9);
        System.out.println(cc);
    }
}

interface Creator{
    Car create(String name,double price);
}