package com.itheima.d4_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamTest3 {
    public static void main(String[] args) throws Exception {
        // 1、一次性读取完文件的全部字节到一个字节数组中去。
        // 创建一个字节输入流管道与源文件接通
        FileInputStream is = new FileInputStream("file-io-app/src/itheima.txt");

        // 2、准备一个字节数组，大小与文件的大小刚好一致
//        File f = new File("file-io-app/src/itheima.txt");
//        long size = f.length();
//        byte[] buffer = new byte[(int) size];
//
//        int len = is.read(buffer);
//        System.out.println(new String(buffer));
//
//        System.out.println(size);
//        System.out.println(len);

        byte[] buffer = is.readAllBytes();
        System.out.println(buffer.length);

    }
}
