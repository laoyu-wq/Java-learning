package com.itheima.d1_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionTest2API {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();//多态

        c.add("java1");
        c.add("java1");
        c.add("java2");
        c.add("java2");
        c.add("java3");
        System.out.println(c);

//        c.clear();
//        System.out.println(c);

        System.out.println(c.isEmpty());

        System.out.println(c.size());

        System.out.println(c.contains("java1"));
        System.out.println(c.contains("java1"));

        System.out.println(c.remove("java1"));//如果有多个重复元素默认删除第一个
        System.out.println(c);

        Object[] arr = c.toArray();// 集合转数组
        System.out.println(Arrays.toString(arr));

        String[] arr2 = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(arr2));

        System.out.println("-----------------------------------------");

        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("java3");
        c2.add("java4");
        c1.addAll(c2);
        System.out.println(c1);
        System.out.println(c2);
    }
}
