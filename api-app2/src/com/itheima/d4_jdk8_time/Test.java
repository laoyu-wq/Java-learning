package com.itheima.d4_jdk8_time;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getYear() + 1900);

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        // 2、都是可变对象，修改后会丢失最开始时间信息

        // 3、线程不安全

        // 4、不能精确到纳秒，只能精确到毫秒
    }
}
