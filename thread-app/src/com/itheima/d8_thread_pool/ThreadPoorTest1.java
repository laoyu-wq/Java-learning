package com.itheima.d8_thread_pool;

import java.util.concurrent.*;

public class ThreadPoorTest1 {
    public static void main(String[] args) {
        /*ThreadPoolExecutor(int corePoolSize,
                              int maximumPoolSize,
                              long keepAliveTime,
                              TimeUnit unit,
                              BlockingQueue<Runnable> workQueue,
                              ThreadFactory threadFactory,
                              RejectedExecutionHandler handler)*/
        ExecutorService pool = new ThreadPoolExecutor(3,5,8,TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy());
//                new ThreadPoolExecutor.DiscardPolicy());
                new ThreadPoolExecutor.CallerRunsPolicy());

        Runnable target = new MyRunnable();//execute一般用于执行Runnable任务
        pool.execute(target);//线程池会自动创建一个新线程，自动处理这个任务，自动执行
        pool.execute(target);//线程池会自动创建一个新线程，自动处理这个任务，自动执行
        pool.execute(target);//线程池会自动创建一个新线程，自动处理这个任务，自动执行
        pool.execute(target);//线程池复用
        pool.execute(target);//线程池复用
        pool.execute(target);//线程池复用
        pool.execute(target);//线程池复用
        // 到了临时线程的创建时机了
        pool.execute(target);
        pool.execute(target);
        // 到了新任务的拒绝时机了
        pool.execute(target);

//        pool.shutdown();//在任务完毕之后关闭线程池
//        pool.shutdownNow();//立即关闭线程池，不管线程任务是否完成
    }
}
