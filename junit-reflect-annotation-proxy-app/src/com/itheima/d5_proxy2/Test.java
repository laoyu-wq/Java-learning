package com.itheima.d5_proxy2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        // 1、创建业务用户对象
//        UserService userService = new UserServiceImpl();
        UserService userService = ProxyUtil.createProxy(new UserServiceImpl());

        // 2、调用用户业务的功能
        userService.login("admin","123456");
        System.out.println("-------------------------------------");

        userService.deleteUsers();
        System.out.println("-------------------------------------");

        String[] names = userService.selectUsers();
        System.out.println("查询到的用户是：" + Arrays.toString(names));
        System.out.println("-------------------------------------");
    }
}
