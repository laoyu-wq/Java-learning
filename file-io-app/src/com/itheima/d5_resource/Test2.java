package com.itheima.d5_resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args){
        FileInputStream is = null;
        FileOutputStream os = null;
        try {
            System.out.println(10 / 0);
            // 1、创建一个字节输入流管道与源文件接通
//        FileInputStream is =
//                new FileInputStream("C:\\Users\\Z050158\\Pictures\\QQ图片20221123151840.jpg");
            is =
                    new FileInputStream("file-io-app/src/itheima3.txt");

            // 2、创建一个字节输出流管道与目标文件接通
//        FileOutputStream os = new FileOutputStream("C:\\Users\\Z050158\\Pictures\\0.jpg");
            os =
                    new FileOutputStream("file-io-app/src/itheima3copy.txt");
            // 3、创建一个字节数组，负责转移字节数据
            byte[] buffer = new byte[1024];
            // 4、从字节输入流中读取字节数据，写出去到字节输出流中。读多少写出去多少
            int len;// 每次读取多少个字节
            while ((len = is.read(buffer)) != -1){
                os.write(buffer,0,len);
            }

            System.out.println("复制成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (os != null)os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (is != null)is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
