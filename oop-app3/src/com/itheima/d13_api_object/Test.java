package com.itheima.d13_api_object;

import java.sql.Struct;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("赵敏",23);
        System.out.println(s1);

        Student s2 = new Student("赵敏",23);
        System.out.println(s2.equals(s1));
        System.out.println(s2 == s1);
    }
}
