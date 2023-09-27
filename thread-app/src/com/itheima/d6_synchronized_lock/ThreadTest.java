package com.itheima.d6_synchronized_lock;

public class ThreadTest {
    public static void main(String[] args) {
        Account acc = new Account("ICBC-110",100000);
        // 创建两个线程，分别代表小明和小红
        new DrawThread(acc,"小明").start();// 小明
        new DrawThread(acc,"小红").start();// 小红

    }
}
