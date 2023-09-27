package com.itheima.d2_recursion;

import java.io.File;
// 删除非空文件夹
public class RecursionTest4 {
    public static void main(String[] args) {

    }

    public static void deleteDir(File dir){
        if (dir == null || !dir.exists()){
            return;
        }

        if (dir.isFile()){
            dir.delete();
            return;
        }

        File[] files = dir.listFiles();
        if (files == null){
            return;
        }

        for (File file : files) {
            if (file.isFile()){
                file.delete();
            }else {
                deleteDir(file);
            }
        }
        dir.delete();
    }
}
