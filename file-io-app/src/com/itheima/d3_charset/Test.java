package com.itheima.d3_charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String data = "a我b";
        byte[] bytes = data.getBytes();//默认UTF-8编码
        System.out.println(Arrays.toString(bytes));

        //按照指定字符集进行编码
        byte[] bytes1 = data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        String s1 = new String(bytes);//默认UTF-8解码
        System.out.println(s1);

        String s2 = new String(bytes1);
        System.out.println(s2);
    }
}
