package com.itheima.d5_resource;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args){
        try (
                // 1、创建一个字节输入流管道与源文件接通
                FileInputStream is = new FileInputStream("file-io-app/src/itheima3.txt");
                // 2、创建一个字节输出流管道与目标文件接通
                FileOutputStream os = new FileOutputStream("file-io-app/src/itheima3copy.txt");

                //只能放置资源对象（流对象）
                //什么是资源
                //资源都是会实现AutoCLoseable接口，资源都会有一个close方法，而且资源放到最后
                //用完之后，会被自动调用其close方法完成资源的释放操作
                MyConnection conn = new MyConnection();
                ){
//            System.out.println(10 / 0);

            // 3、创建一个字节数组，负责转移字节数据
            byte[] buffer = new byte[1024];
            // 4、从字节输入流中读取字节数据，写出去到字节输出流中。读多少写出去多少
            int len;// 每次读取多少个字节
            while ((len = is.read(buffer)) != -1){
                os.write(buffer,0,len);
            }
            System.out.println(conn);
            System.out.println("复制成功");
        } catch (Exception e) {
            throw new RuntimeException(e);
//            e.printStackTrace();
        }
    }
}
