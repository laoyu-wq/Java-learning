package com.itheima.d2_buffered_stream;

import java.io.*;

public class BufferedInputStreamTest1 {
    public static void main(String[] args) {
        try (
                InputStream is = new FileInputStream("io-app2\\src\\com.itheima\\itheima01.txt");

                BufferedInputStream bis = new BufferedInputStream(is);
                FileOutputStream os = new FileOutputStream("io-app2\\src\\com.itheima\\itheima01_bak.txt");
                OutputStream bos = new BufferedOutputStream(os);
                ){
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
            System.out.println("复制完成");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
