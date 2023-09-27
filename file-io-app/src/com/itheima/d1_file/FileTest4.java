package com.itheima.d1_file;

import java.io.File;
import java.util.Arrays;

public class FileTest4 {
    public static void main(String[] args) {
        File f1 = new File("D:/Code");
        String[] names = f1.list();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("------------------------------");

        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }

        File f = new File("D:/Code/Python/aaa");
        File[] files1 = f.listFiles();
        System.out.println(Arrays.toString(files1));
    }
}
