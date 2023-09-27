package com.itheima.d1_parameter;

import java.util.Arrays;

public class ParamTest {
    public static void main(String[] args) {
        test();
        test(10);
        test(10,20);
        test(new int[]{10,20,30});
    }

    // 一个形参列表中，只能有一个可变参数
    public static void test(int... nums){
        // 可变参数在方法内部，本质上是数组
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("---------------------------");
    }
}
