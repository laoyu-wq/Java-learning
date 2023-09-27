package com.itheima.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("赵");
        c.add("昭");
        c.add("素");
        c.add("灭绝");
        System.out.println(c);
        System.out.println("-------------------------------");

        // 结合Lambda表达式遍历集合
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        c.forEach((String s) -> {
            System.out.println(s);
        });

        c.forEach(s -> {
            System.out.println(s);
        });

        c.forEach(s -> System.out.println(s));

        c.forEach(System.out::println);
    }
}
