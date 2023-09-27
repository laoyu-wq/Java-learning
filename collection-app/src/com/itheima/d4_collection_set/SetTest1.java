package com.itheima.d4_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest1 {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();// HashSet:无需不重复 无索引
//        Set<Integer> set = new LinkedHashSet<>();//LinkedHashSet：有序，不重复 无索引
        Set<Integer> set = new TreeSet<>();// 可排序(升序) 不重复 无索引
        set.add(666);
        set.add(555);
        set.add(888);
        set.add(888);
        set.add(777);
        set.add(777);
        System.out.println(set);
    }
}
