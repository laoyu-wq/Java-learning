package com.itheima.d1_create_thread;

public class ThreadTest2 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable();

        new Thread(target).start();

        for (int i = 0; i <= 5; i++) {
            System.out.println("主线程main输出" + i);
        }
    }
}
