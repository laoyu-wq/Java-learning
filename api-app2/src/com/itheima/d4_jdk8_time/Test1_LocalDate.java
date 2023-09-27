package com.itheima.d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test1_LocalDate {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        // 1、获取日期对象中的信息
        int year = ld.getYear();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        int dayOfYear = ld.getDayOfYear();  // 一年中的第几天
        int dayOfWeek = ld.getDayOfWeek().getValue();   // 星期几
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfWeek);

        // 2、直接修改某个信息：withYear、withMonth、withDayOfMonth、withDayOfYear
        LocalDate ld2 = ld.withYear(2099);
        LocalDate ld3 = ld.withMonth(12);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld);

        // 3、把某个信息加多少：plusYear、plusMonths、plusDays、plusWeek
        LocalDate ld4 = ld.plusYears(2);
        LocalDate ld5 = ld.plusMonths(2);

        // 4、把某个信息减多少：minusYear、minusMonths、minusDays、minusWeeks
        LocalDate ld6 = ld.minusYears(2);
        LocalDate ld7 = ld.minusMonths(2);

        // 5、获取指定日期的LocalDate对象：public static LocalDate Of(int year,int month,int dayOfMonth)
        LocalDate ld8 = LocalDate.of(2099,12,12);
        LocalDate ld9 = LocalDate.of(2099,12,12);

        // 6、判断2个日期对象，是否相等，在前还是在后：equals isBefore isAfter
        System.out.println(ld8.equals(ld9));
        System.out.println(ld8.isAfter(ld));
        System.out.println(ld8.isBefore(ld));
    }
}
