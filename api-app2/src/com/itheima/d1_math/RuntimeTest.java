package com.itheima.d1_math;

import java.io.IOException;

public class RuntimeTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime r = Runtime.getRuntime();
//        r.exit(0);
        // 虚拟机能够使用的处理器数
        System.out.println(r.availableProcessors());
        // java虚拟机中的内存总量
        System.out.println(r.totalMemory() / 1024 / 1024 + "MB");
        // java虚拟机中可用内存量
        System.out.println(r.freeMemory() / 1024 / 1024 + "MB");

        // 启动某个程序，并返回代表该程序的对象
//        r.exec("E:\\axmath\\AxMath.exe");
        Process p = r.exec("MATLAB");
        Thread.sleep(10000);
        p.destroy();
    }
}
