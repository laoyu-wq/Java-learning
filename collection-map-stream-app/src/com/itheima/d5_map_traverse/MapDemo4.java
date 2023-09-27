package com.itheima.d5_map_traverse;

import java.util.*;

public class MapDemo4 {
    public static void main(String[] args) {
        //景点数据
        List<String> data = new ArrayList<>();
        String[] selects = {"A","B","C","D"};
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(4);//0 1 2 3
            data.add(selects[index]);
        }
        System.out.println(data);

        Map<String,Integer> result = new HashMap<>();

        for (String s : data) {
            // 问问Map集合中是否存在该景点
            if (result.containsKey(s)){
                // 说明这个经典之前统计过
                result.put(s,result.get(s) + 1);
            } else {
                // 第一次统计
                result.put(s,1);
            }
        }
        System.out.println(result);
    }
}
