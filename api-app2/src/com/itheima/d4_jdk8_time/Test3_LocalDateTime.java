package com.itheima.d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test3_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // 1、获取时间中的信息
        int year = ldt.getYear();
        int month = ldt.getMonthValue();
        int day = ldt.getDayOfMonth();
        int dayOfYear = ldt.getDayOfMonth();
        int dayOfWeek = ldt.getDayOfWeek().getValue();
        int hour = ldt.getHour();
        int monute = ldt.getMinute();
        int second = ldt.getSecond();
        int nano = ldt.getNano();// 纳秒

        // 2、修改时间：withHour,withMinute,withSecond,withNano
        LocalDateTime ldt2 = ldt.withYear(2829);
        LocalDateTime ldt3 = ldt.withMinute(59);

        // 3、加多少
        LocalDateTime ldt4 = ldt.plusHours(10);
        LocalDateTime ldt5 = ldt.plusMinutes(10);

        // 4、把某个信息减多少：minusYear、minusMonths、minusDays、minusWeeks
        LocalDateTime ldt6 = ldt.minusYears(2);
        LocalDateTime ldt7 = ldt.minusMinutes(3);

        // 5、获取指定日期的LocalDate对象：public static LocalDate Of(int year,int month,int dayOfMonth)
        LocalDateTime ldt8 = LocalDateTime.of(2029,12,12,12,12,12,12);
        LocalDateTime ldt9 = LocalDateTime.of(2029,12,12,12,12,12,12);

        // 6、判断2个日期对象，是否相等，在前还是在后：equals isBefore isAfter
        System.out.println(ldt9.equals(ldt8));
        System.out.println(ldt9.isAfter(ldt));
        System.out.println(ldt9.isBefore(ldt));

        // 7、可以把LocalDateTime转换成LocalDate和LocalTime
        LocalDate ld = ldt.toLocalDate();
        LocalTime lt = ldt.toLocalTime();
        LocalDateTime ldt10 = LocalDateTime.of(ld,lt);
    }
}
