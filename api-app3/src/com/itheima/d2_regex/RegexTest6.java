package com.itheima.d2_regex;

import java.util.Arrays;

public class RegexTest6 {
    public static void main(String[] args) {
        // 1、public String replaceAll(String regex,String newStr):按照正则表达式匹配的内容进行替换
        // 需求1：把下面字符串的非中文字符替换成”-“
        String s1 = "古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbbfsfs42425卡尔扎哈";
        System.out.println(s1.replaceAll("\\w+", "-"));
        // 需求2（拓展）：某语音系统，收到一个口吃的人说的”我我我喜欢编编编编编编编编编编编编程程程！“，需要优化成”我喜欢编程“

        /*
        * (.)一组：.匹配任意字符的。
        * \\1:为这个组声明一个组号
        * +：生命必须是重复的字
        * $1可以去到第1组代表的那个重复的字
        * */
        String s2 = "我我我喜欢编编编编编编编编编编编编程程程";
        System.out.println(s2.replaceAll("(.)\\1+", "$1"));

        // 2、public String[] split(String regex)：按照正则表达式匹配的内容进行分割字符串，返回一个字符串数组
        // 需求1：请把 古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbbfsfs42425卡尔扎哈  中的人名找出来
        String s3 = "古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbbfsfs42425卡尔扎哈";
        String[] names = s3.split("\\w+");
        System.out.println(Arrays.toString(names));
    }
}
