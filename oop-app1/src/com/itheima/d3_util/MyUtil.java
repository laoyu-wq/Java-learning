package com.itheima.d3_util;

import java.util.Random;

public class MyUtil {
    // 这样就无法通过创建对象调用createCode方法
    private MyUtil() {
    }

    public static String createCode(int n){
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
//        System.out.println(code);
        return code;
    }
}
