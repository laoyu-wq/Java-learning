package com.itheima.d2_regex;

import java.util.Scanner;

public class RegexTest3 {
    public static void main(String[] args) {
        checkPhone();
    }

    public static void checkPhone(){
        while (true) {
            System.out.println("请输入您的电话号码(手机|座机)");
            Scanner sc = new Scanner(System.in);
            String phone = sc.nextLine();

            if (phone.matches("1[3-9]\\d{9}|(0\\d{2,7}-?[1-9]\\d{4,19})")){
                System.out.println("您输入的号码格式正确~~~");
                break;
            }else {
                System.out.println("您输入的号码格式不正确~~~");
            }
        }
    }

    public static void checkEmail(){
        while (true) {
            System.out.println("请输入您的电话号码(手机|座机)");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (email.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}")){
                System.out.println("您输入的邮箱格式正确~~~");
                break;
            }else {
                System.out.println("您输入的邮箱格式不正确~~~");
            }
        }
    }
}
