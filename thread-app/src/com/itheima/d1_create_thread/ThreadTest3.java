package com.itheima.d1_create_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建一个Callable对象
        Callable<String> call = new MyCallable(100);
        // 把Callable对象封装成一个FutureTask对象（任务对象）

        // 是一个任务对象
        // 可以在线程执行完毕之后，用未来任务对象调用get方法获取线程执行完毕后的结果
        FutureTask<String> f1 = new FutureTask<>(call);
        // 把任务对象交给一个Thread对象
        new Thread(f1).start();

        Callable<String> call2 = new MyCallable(200);
        FutureTask<String> f2 = new FutureTask<>(call2);
        new Thread(f2).start();

        // 获取线程执行完毕后返回的结果
        String rs = f1.get();
        System.out.println(rs);
        String rs2 = f2.get();
        System.out.println(rs2);
    }
}
