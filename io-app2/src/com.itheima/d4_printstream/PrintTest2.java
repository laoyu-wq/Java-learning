package com.itheima.d4_printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintTest2 {
    public static void main(String[] args) {
        System.out.println("老骥伏枥");
        System.out.println("志在千里");

        try (
                PrintStream ps = new PrintStream("io-app2\\src\\com.itheima\\itheima09.txt");
                ){
            System.setOut(ps);
            System.out.println("烈士暮年");
            System.out.println("壮心不已");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(123);

    }
}
