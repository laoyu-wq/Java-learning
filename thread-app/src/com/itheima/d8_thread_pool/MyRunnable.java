package com.itheima.d8_thread_pool;

import com.itheima.d7_thread_communication.ThreadTest;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "==>输出666");
        try {
//            Thread.sleep(1000);
            Thread.sleep(Integer.MAX_VALUE);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
