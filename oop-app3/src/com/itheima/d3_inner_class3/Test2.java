package com.itheima.d3_inner_class3;

public class Test2 {
    public static void main(String[] args) {
//        Swimming s1 = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("狗游的飞快");
//            }
//        };
//        go(s1);
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("狗游的飞快");
            }
        });
    }

    public static void go(Swimming s){
        System.out.println("开始----------------------------");
        s.swim();
    }
}

interface Swimming{
    void swim();
}
