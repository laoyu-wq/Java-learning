package com.itheima.d3_collection_list;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("蜘蛛精");
        list.add("至尊宝");
        list.add("至尊宝");
        list.add("牛夫人");
        System.out.println(list);

        list.add(2,"紫霞仙子");
        System.out.println(list);

        System.out.println(list.remove(2));
        System.out.println(list);

        System.out.println(list.get(3));

        list.set(3,"牛魔王");
        System.out.println(list);
    }
}
