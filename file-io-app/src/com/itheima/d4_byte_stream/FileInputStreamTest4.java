package com.itheima.d4_byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputStreamTest4 {
    public static void main(String[] args) throws Exception {
        // 1、创建一个字节输出流管道与目标文件接通
        // 覆盖管道：
//        FileOutputStream os =
//                new FileOutputStream("file-io-app/src/itheima4.txt");

        // 追加数据的管道
        FileOutputStream os =
                new FileOutputStream("file-io-app/src/itheima4.txt",true);

        // 开始写字节数据出去了
        os.write(97);
        os.write('b');
//        os.write('磊');

        byte[] bytes = "我爱你中国abc".getBytes();
        os.write(bytes,0,15);

        // 换行符
        os.write("\r\n".getBytes());

        os.close();// 关闭流
    }
}
