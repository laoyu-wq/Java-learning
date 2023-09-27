package com.itheima.hospitalregistration;

import com.itheima.hospitalregistration.frame.HosptialManger;

public class App {
    public static void main(String[] args) {
        // 1、创建一个医院管理对象
        HosptialManger h = new HosptialManger();
        h.start();
    }
}
