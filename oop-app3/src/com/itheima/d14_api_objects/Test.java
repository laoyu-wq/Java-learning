package com.itheima.d14_api_objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String s1 = null;//"itheima";
        String s2 = "itheima";
//        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2));

        System.out.println(Objects.isNull(s1));
        System.out.println(s1 == null);
        System.out.println(Objects.isNull(s2));
        System.out.println(s2 == null);

        System.out.println(Objects.nonNull(s1));
        System.out.println(Objects.nonNull(s2));
    }
}
