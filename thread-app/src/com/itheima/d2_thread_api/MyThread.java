package com.itheima.d2_thread_api;

public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        Thread t = Thread.currentThread();
        for (int i = 0; i <= 3; i++) {
//            System.out.println("子线程MyThread输出：" + i);
            System.out.println(t.getName() + "输出：" + i);
        }
    }
}
