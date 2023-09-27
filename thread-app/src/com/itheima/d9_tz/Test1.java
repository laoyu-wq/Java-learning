package com.itheima.d9_tz;

public class Test1 {
    public static void main(String[] args) {
        // 悲观锁和乐观锁
        // 悲观锁：一上来就加锁，没有安全感，每次只能一个线程进入访问，完毕后解锁。 线程安全，性能较差
        // 乐观锁：一开始不上锁，认为是没有问题的，大家一起跑，等出现线程安全问题后才开始去控制。线程安全，性能较好。
        Runnable target = new MyRunnable();
        for (int i = 1; i <= 100; i++) {
            new Thread(target).start();
        }
    }
}
