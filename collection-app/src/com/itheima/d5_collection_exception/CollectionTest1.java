package com.itheima.d5_collection_exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("王");
        list.add("小李子");
        list.add("李爱华");
        list.add("张全蛋");
        list.add("小李");
        list.add("李玉刚");
        System.out.println(list);

//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String name = it.next();
//            if (name.contains("李")){
//                list.remove(name);
//            }
//        }
//        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            if (name.contains("李")){
//                list.remove(name);
//            }
//        }
//        System.out.println(list);
        System.out.println("---------------------------------");
//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            if (name.contains("李")){
//                list.remove(name);
//                i--;
//            }
//        }
//        System.out.println(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String name = it.next();
            if (name.contains("李")){
                it.remove();
            }
        }
        System.out.println(list);

        // 使用增强for循环无法解决并发修改异常的bug,foreach同理
//        for (String name:list){
//            if (name.contains("李")){
//                list.remove(name);
//            }
//        }
        System.out.println(list);


    }
}
