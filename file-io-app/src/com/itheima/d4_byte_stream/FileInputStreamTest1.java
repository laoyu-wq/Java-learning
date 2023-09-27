package com.itheima.d4_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamTest1 {
    public static void main(String[] args) throws Exception {
        // 1、创建文件字节输入流管道，与源文件接通
//        FileInputStream is = new FileInputStream(new File("file-io-app/src/itheima.txt"));
        FileInputStream is = new FileInputStream("file-io-app/src/itheima.txt");

        // 2、开始读取文件的字节数据
//        int b1 = is.read();
//        System.out.println((char) b1);
//
//        int b2 = is.read();
//        System.out.println((char) b2);
//
//        int b3 = is.read();
//        System.out.println((char) b3);

        // 3、使用循环改造
        int b;
        while ((b = is.read()) != -1){
            System.out.print((char) b);
        }

        // 读取数据的性能很差
        // 读取汉字输出会乱码，无法避免
        // 流使用完毕后必须关闭，释放系统资源
        is.close();
    }
}
