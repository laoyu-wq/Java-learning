package com.itheima.d2_thread_api;

public class ThreadTest2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            if (i == 3){
                Thread.sleep(5000);
            }
        }


        Thread t1 = new MyThread("1号线程");
        t1.start();
        t1.join();
        Thread t2 = new MyThread("2号线程");
        t2.start();
        t2.join();
        Thread t3 = new MyThread("3号线程");
        t3.start();
        t3.join();
    }
}
