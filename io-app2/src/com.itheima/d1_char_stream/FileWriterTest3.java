package com.itheima.d1_char_stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("io-app2\\src\\com.itheima\\itheima03.txt");
        fw.write('a');
        fw.write('b');
        fw.write('c');
        fw.write('d');
        fw.write("\r\n");

        fw.flush();// 刷新流。
        fw.write("张三");
        fw.flush();

        fw.close();// 关闭流，关闭流包括刷新操作
    }
}
