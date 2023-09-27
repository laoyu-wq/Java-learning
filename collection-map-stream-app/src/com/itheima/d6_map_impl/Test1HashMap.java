package com.itheima.d6_map_impl;

import java.util.HashMap;
import java.util.Map;

public class Test1HashMap {
    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<>();
        map.put(new Student("蜘蛛精",25,168.5),"盘丝洞");
        map.put(new Student("蜘蛛精",25,168.5),"水帘洞");
        map.put(new Student("至尊宝",25,163.5),"水帘洞");
        map.put(new Student("牛魔王",25,183.5),"牛头山");
        System.out.println(map);
    }
}
