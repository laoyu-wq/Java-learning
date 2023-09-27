package com.itheima.d5_map_traverse;

import com.itheima.d2_collections.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
    public static void main(String[] args) {
        // 准备一个Map集合
        Map<String,Double> map = new HashMap<>();
        map.put("蜘蛛精",169.5);
        map.put("紫霞",169.6);
        map.put("紫霞",169.6);
        map.put("至尊宝",169.8);
        System.out.println(map);

        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String key : keys) {
            double value = map.get(key);
            System.out.println(key + "=====>" + value);
        }
    }
}
