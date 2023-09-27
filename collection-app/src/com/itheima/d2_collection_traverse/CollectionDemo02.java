package com.itheima.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("赵");
        c.add("昭");
        c.add("素");
        c.add("灭绝");
        System.out.println(c);
        System.out.println("-------------------------------");

        // 使用增强for遍历集合或数组
        for(String ele : c){
            System.out.println(ele);
        }

        String[] names = {"迪丽热巴","古力娜扎","稀奇哈哈"};
        for (String name:names){
            System.out.println(name);
        }

    }
}
