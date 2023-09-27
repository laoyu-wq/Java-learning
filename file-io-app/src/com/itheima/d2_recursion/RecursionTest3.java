package com.itheima.d2_recursion;

import java.io.File;

public class RecursionTest3 {
    public static void main(String[] args) throws Exception {
        searchFile(new File("D:/"),"WeChat.exe");
    }

    public static void searchFile(File dir,String fileName) throws Exception {

        // 1、拦截非法情况
        if (dir == null || !dir.exists() || dir.isFile()){
            return;
        }

        // 2、dir不是null，存在，一定是目录对象
        File[] files = dir.listFiles();

        // 3、判断当前对象是否存在以及文件对象，以及是否可以拿到一级文件对象
        if (files != null && files.length > 0){
            // 4、遍历全部一级文件对象
            for (File file : files) {
                // 5、判断文件是否是文件还是文件夹
                if (file.isFile()){
                    if (file.getName().contains(fileName)){
                        System.out.println("找到了:" + file.getAbsolutePath());
                        Runtime runtime = Runtime.getRuntime();
                        runtime.exec(file.getAbsolutePath());
                    }
                }else {
                    // 是文件夹，递归
                    searchFile(file,fileName);
                }
            }
        }
    }
}
