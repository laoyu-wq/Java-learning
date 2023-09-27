package com.itheima.d2_thread_api;

public class ThreadTest1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread("1号线程");
//        t1.setName("1号线程");
        t1.start();
        System.out.println(t1.getName());

        Thread t2 = new MyThread("2号线程");
//        t2.setName("2号线程");
        t2.start();
        System.out.println(t2.getName());

        // 主线程对象的名字
        // 哪个线程执行它，它就会得到哪个线程的对象
        Thread m = Thread.currentThread();
        System.out.println(m.getName());

        for (int i = 1; i <= 5; i++) {
            System.out.println("main线程输出：" + i);
        }
    }
}
