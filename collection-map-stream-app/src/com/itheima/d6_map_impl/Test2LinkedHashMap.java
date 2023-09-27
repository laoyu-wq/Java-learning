package com.itheima.d6_map_impl;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test2LinkedHashMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();// 有序 不重复 无索引
        map.put("手表",100);
        map.put("手表",220);// 后面重复的数据会覆盖掉前面的数据
        map.put("手机",2);
        map.put("Java",2);
        map.put(null,null);
        System.out.println(map);
    }
}
