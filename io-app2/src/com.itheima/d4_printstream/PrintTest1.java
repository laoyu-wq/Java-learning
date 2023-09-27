package com.itheima.d4_printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintTest1 {
    public static void main(String[] args) {
        try (
                // 1、创建一个打印流管道
//                PrintStream ps = new PrintStream("io-app2\\src\\com.itheima\\itheima08.txt");

                PrintWriter ps = new PrintWriter("io-app2\\src\\com.itheima\\itheima08.txt");
                ){
            ps.println(97);
            ps.println(true);
            ps.println("中国");
            ps.println(99.5);
            ps.write("123");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
