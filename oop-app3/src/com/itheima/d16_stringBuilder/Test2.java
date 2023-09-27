package com.itheima.d16_stringBuilder;

public class Test2 {
    public static void main(String[] args) {
        // 目标：掌握StringBuilder的好处
        // 需求：要拼接100万次

//        // 试试String
//        String rs = "";
//        for (int i = 0; i < 1000000; i++) {
//            rs = rs + "abc";
//        }
//        System.out.println(rs);

        // 试试StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);
    }
}
