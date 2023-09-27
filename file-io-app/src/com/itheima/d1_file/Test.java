package com.itheima.d1_file;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File dir = new File("");

        // 拿到全部视频
        File[] videos = dir.listFiles();

        // 一个一个找
        for (File video : videos) {
            // 拿到名字，改名字
            String name = video.getName();
            String index = name.substring(0,name.indexOf("、"));
            String lastName = name.substring(name.indexOf("、"));
            String newName = (Integer.valueOf(index) + 18) + lastName;
            video.renameTo(new File(dir,newName));
        }
    }
}
