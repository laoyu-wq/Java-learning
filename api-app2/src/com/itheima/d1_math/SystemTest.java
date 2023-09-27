package com.itheima.d1_math;

public class SystemTest {
    public static void main(String[] args) {
        // exit()终止当前运行的虚拟机
//        System.exit(0);// 人为终止虚拟机（别瞎用）
        System.out.println("-------------------------");

        // currentTimeMillis获取当前系统时间
        long time = System.currentTimeMillis();
        System.out.println(time);
    }
}
