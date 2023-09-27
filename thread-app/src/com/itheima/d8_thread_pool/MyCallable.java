package com.itheima.d8_thread_pool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        // 描述现成的任务，返回线程执行返回后的结果
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "线程求出来1-" + n + "的和是：" + sum;
    }
}
