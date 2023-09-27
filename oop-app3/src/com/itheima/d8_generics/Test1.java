package com.itheima.d8_generics;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("java1");
        list.add("java2");
        list.add("java3");
//        list.add(new Cat());

        for (int i = 0; i < list.size(); i++) {
//            list.get(i);
            String e = (String) list.get(i);
            System.out.println(e);
        }

        System.out.println("-----------------------------------------------");
        ArrayList<String> list1 = new ArrayList<>(); //从JDK1.7开始，后面的数据类型可以不声明
        list1.add("java1");
        list1.add("java2");
        list1.add("java3");

        for (int i = 0; i < list1.size(); i++) {
            String e = list1.get(i);
            System.out.println(e);
        }
    }
}
class Cat{}