package com.itheima.d3_transform_stream;

import java.io.*;

public class InputStreamReaderTest2 {
    public static void main(String[] args) {
        try (
                // 1、得到文件的原始字节流
                InputStream is = new FileInputStream("io-app2/src/com.itheima/itheima06.txt");
                // 2、把原始字节输入流按照制定的字符集编码转换成字符输入流
                Reader isr = new InputStreamReader(is,"GBK");
                // 3、把字符输入流包装成缓冲字符输入流
                BufferedReader br = new BufferedReader(isr);
                ){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
