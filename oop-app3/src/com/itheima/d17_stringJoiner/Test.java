package com.itheima.d17_stringJoiner;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        // 目标：掌握StringJoiner的使用
        StringJoiner s = new StringJoiner(",");
        s.add("java1");
        s.add("java2");
        s.add("java3");
        System.out.println(s);

        System.out.println(getArrayData(new int[]{11, 22, 33}));
    }

    public static String getArrayData(int[] arr){
        // 1、判断arr是否为null
        if (arr == null){
            return null;
        }
        // 2、arr数组对象存在。arr = [11, 22 ,33]
        StringJoiner s = new StringJoiner(", ","[","]");
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i] + "");
        }
        return s.toString();
    }
}
