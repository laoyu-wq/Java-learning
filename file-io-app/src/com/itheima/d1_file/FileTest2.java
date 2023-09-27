package com.itheima.d1_file;

import java.io.File;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;

public class FileTest2 {
    public static void main(String[] args) {
        File f1 = new File("D:/Code/Python/edge.py");

        System.out.println(f1.exists());

        System.out.println(f1.isFile());

        System.out.println(f1.isDirectory());

        System.out.println(f1.getName());

        System.out.println(f1.length());

        long time = f1.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(time));

        File f2 = new File("D:/Code/Python/edge.py");
        File f3 = new File("file-io-app/src/itheima.txt");
        System.out.println(f2.getPath());
        System.out.println(f3.getPath());

        System.out.println(f2.getAbsolutePath());
        System.out.println(f3.getAbsolutePath());
    }
}
