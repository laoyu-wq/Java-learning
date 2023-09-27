package com.itheima.d1_char_stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest2 {
    public static void main(String[] args) {
        try (
                // 创建一个文字字符输出流管道与目标文件接通
                // 覆盖管道
//                FileWriter fw = new FileWriter("io-app2\\src\\com.itheima\\itheima02.txt");
                // 追加管道
                FileWriter fw = new FileWriter("io-app2\\\\src\\\\com.itheima\\\\itheima02.txt",true);
                ){
            fw.write('a');
            fw.write(97);
            fw.write('磊');
            fw.write("\r\n");

            fw.write("我爱你中国abc");
            fw.write("\r\n");
            fw.write("我爱你中国abc",0,5);
            fw.write("\r\n");

            char[] buffer = {'黑','马','a','b','c'};
            fw.write(buffer);
            fw.write("\r\n");
            fw.write(buffer,0,2);
            fw.write("\r\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
