package com.itheima.d1_create_thread;

public class ThreadTest1 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();// main线程 t线程
        for (int i = 0; i <= 5; i++) {
            System.out.println("主线程main输出：" + i);
        }
    }
}
