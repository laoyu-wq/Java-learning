package com.itheima.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("赵");
        c.add("昭");
        c.add("素");
        c.add("灭绝");
        System.out.println(c);
        System.out.println("-------------------------------");

        //迭代器遍历集合
        Iterator<String> it = c.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
//        System.out.println(it.next());//异常

        // 循环结合迭代器遍历集合
        while (it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }
    }
}
