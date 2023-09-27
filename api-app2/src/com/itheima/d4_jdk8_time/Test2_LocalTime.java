package com.itheima.d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test2_LocalTime {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        // 1、获取时间中的信息
        int hour = lt.getHour();
        int monute = lt.getMinute();
        int second = lt.getSecond();
        int nano = lt.getNano();// 纳秒

        // 2、修改时间：withHour,withMinute,withSecond,withNano
        LocalTime lt3 = lt.withHour(10);
        LocalTime lt4 = lt.withMinute(10);
        LocalTime lt5 = lt.withSecond(10);
        LocalTime lt6 = lt.withNano(10);

        // 3、加多少
        LocalTime lt7 = lt.plusHours(10);
        LocalTime lt8 = lt.plusMinutes(10);
        LocalTime lt9 = lt.plusSeconds(10);
        LocalTime lt10 = lt.plusNanos(10);

        // 4、把某个信息减多少：minusYear、minusMonths、minusDays、minusWeeks
        LocalTime lt11 = lt.minusHours(10);
        LocalTime lt12 = lt.minusMinutes(10);
        LocalTime lt13 = lt.minusSeconds(10);
        LocalTime lt14 = lt.minusNanos(10);

        // 5、获取指定日期的LocalDate对象：public static LocalDate Of(int year,int month,int dayOfMonth)
        LocalTime lt15 = LocalTime.of(12,12,12);
        LocalTime lt16 = LocalTime.of(12,12,12);

        // 6、判断2个日期对象，是否相等，在前还是在后：equals isBefore isAfter
        System.out.println(lt15.equals(lt16));
        System.out.println(lt15.isAfter(lt));
        System.out.println(lt15.isBefore(lt));
    }
}
