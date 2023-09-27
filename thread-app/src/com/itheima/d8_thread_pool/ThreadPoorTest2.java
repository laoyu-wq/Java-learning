package com.itheima.d8_thread_pool;

import java.util.concurrent.*;

public class ThreadPoorTest2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
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

        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());


//        pool.shutdown();//在任务完毕之后关闭线程池
//        pool.shutdownNow();//立即关闭线程池，不管线程任务是否完成
    }
}
