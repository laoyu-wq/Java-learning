package com.itheima.d5_resource;

public class Test1 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            return;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("====finally====");
        }
        System.out.println(chu(10,2));
    }

    public static int chu(int a,int b){
        try {
            return a / b;
        } catch (Exception e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
            return -1;
        } finally {
            // 千万不要再finally中返回数据
//            return 111;
        }
    }
}
