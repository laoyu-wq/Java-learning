package com.itheima.d2_buffered_stream;

import java.io.*;

public class BufferedWriterTest3 {
    public static void main(String[] args) {
        try (
                Writer fw = new FileWriter("io-app2\\src\\com.itheima\\itheima04.txt",true);
                // 创建一个字符缓冲输出流管道包装原始的字符输出流
                BufferedWriter bw = new BufferedWriter(fw);
                ){
            bw.write('a');
            bw.write('b');
            bw.write('c');
            bw.write('d');
//            fw.write("\r\n");
            bw.newLine();

//            fw.flush();// 刷新流。
//            fw.write("张三");
//            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
