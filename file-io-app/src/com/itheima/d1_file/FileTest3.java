package com.itheima.d1_file;

import java.io.File;
import java.io.IOException;

public class FileTest3 {
    public static void main(String[] args) throws Exception {
        File f1 = new File("D:/Code/Python/edge.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("D:/Code/Python/aaa");
        System.out.println(f2.mkdir());

        File f3 = new File("D:/Code/Python/bbb/ccc/ddd/eee/ff/ggg");
        System.out.println(f3.mkdirs());

        // 只能删除文件或者空文件夹
        System.out.println(f1.delete());
        System.out.println(f2.delete());
        File f4 = new File("D:/Code/abc");
        System.out.println(f4.delete());
    }
}
