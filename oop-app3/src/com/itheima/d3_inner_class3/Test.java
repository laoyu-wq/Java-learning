package com.itheima.d3_inner_class3;

public class Test {
    public static void main(String[] args) {
        // 匿名内部类
//        Animal a = new Cat();
//        a.cry();
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("喵喵");
            }
        };
        a.cry();
    }
}
//class Cat extends Animal{
//    @Override
//    public void cry() {
//        System.out.println("喵喵");
//    }
//}
abstract class Animal{
    public abstract void cry();
}