package com.itheima.d4_jdk8_time;

import java.time.Instant;

public class Test5_Instant {
    public static void main(String[] args) {
        // 1、创建Instant的对象，获取此刻时间信息
        Instant now = Instant.now();// 不可变对象

        // 2、获取总秒数
        long second = now.getEpochSecond();
        System.out.println(second);

        // 3、不够1秒的纳秒数
        int nano = now.getNano();
        System.out.println(nano);

        System.out.println(now);

        Instant instant = now.plusNanos(111);

        // Instant对象的作用：
        Instant now1 = Instant.now();
        Instant now2 = Instant.now();
    }
}
