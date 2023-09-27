package com.itheima.d4_jdk8_time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class Test4_Zoneld_ZonedDateTime {
    public static void main(String[] args) {
        // 时区
        // ZoneId的常见用法
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId.toString());
        System.out.println(zoneId.getId());

        System.out.println(ZoneId.getAvailableZoneIds());

        ZoneId zonId1 = ZoneId.of("America/New_York");

        // ZonedDateTime:带时区的时间
        ZonedDateTime now = ZonedDateTime.now(zonId1);
        System.out.println(now);

        // 世界标准时
        ZonedDateTime now1 = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(now1);

        // 系统默认时区
        ZonedDateTime now2 = ZonedDateTime.now();
        System.out.println(now2);


        Calendar instance = Calendar.getInstance();
    }
}
