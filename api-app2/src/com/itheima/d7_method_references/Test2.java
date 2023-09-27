package com.itheima.d7_method_references;

import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        String[] names = {"body", "angela", "Andy", "dlei", "caocao", "Babo", "jack", "Cici"};
//        Arrays.sort(names);// 默认按照字符串首字符编号进行升序排序

        // 忽略首字符大小写进行排序
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });

//        Arrays.sort(names, ( o1,  o2) -> o1.compareToIgnoreCase(o2) );
        // 特定类型的方法引用
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));
    }
}
