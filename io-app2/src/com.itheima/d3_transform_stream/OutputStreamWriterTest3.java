package com.itheima.d3_transform_stream;

import java.io.*;

public class OutputStreamWriterTest3 {
    public static void main(String[] args) {
        try (
                // 指定写出去的字符编码
                // 1、创建一个文件字节输出流
                OutputStream os = new FileOutputStream("io-app2/src/com.itheima/itheima07out.txt");
                Writer osw = new OutputStreamWriter(os,"GBK");
                BufferedWriter bw = new BufferedWriter(osw);
                ){
            bw.write("我是中国人abc");
            bw.write("我爱你中国123");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
