package com.itheima.d1_file;

import java.io.File;

public class FileTest1 {
    public static void main(String[] args) {
        File f1 = new File("D:" + File.separator + "Code" + File.separator + "Python" + File.separator + "edge.py");
        System.out.println(f1.length());

        File f2 = new File("D:" + File.separator + "Code" + File.separator + "Python");
        System.out.println(f2.length());

        File f3 = new File("D:/Code/itheima.txt");
        System.out.println(f3.length());
        System.out.println(f3.exists());

        File f4 = new File("file-io-app/src/itheima.txt");
        System.out.println(f4.length());
    }
}
