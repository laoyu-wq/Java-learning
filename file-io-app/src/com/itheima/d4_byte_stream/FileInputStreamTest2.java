package com.itheima.d4_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamTest2 {
    public static void main(String[] args) throws Exception {
        FileInputStream is = new FileInputStream("file-io-app/src/itheima.txt");

//        // 每次读取多个字节到字节数组中去，返回读取的字节数量，读取完毕会返回-1
//        byte[] buffer = new byte[3];
//        int len = is.read(buffer);
//        String rs = new String(buffer);
//        System.out.println(rs);
//        System.out.println("当此读取的字节数量：" + len);
//
//        // 注意：读取多少，倒出多少
//        int len2 = is.read(buffer);
//        String rs2 = new String(buffer,0,len2);
//        System.out.println(rs2);
//        System.out.println("当此读取的字节数量：" + len2);
//
//        int len3 = is.read(buffer);
//        System.out.println(len3);

        byte[] buffer = new byte[3];
        int len;
        while ((len = is.read(buffer)) != -1){
            // 注意：读取多少，倒出多少
            String rs = new String(buffer,0,len);
            System.out.println(rs);
        }

        is.close();
    }
}
