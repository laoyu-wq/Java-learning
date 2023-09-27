package com.itheima.d1_math;

public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.abs(-12));
        System.out.println(Math.abs(123));
        System.out.println(Math.abs(123.14));

        // 向上取整
        System.out.println(Math.ceil(4.0000001));
        System.out.println(Math.ceil(4.0));

        // 向下取整
        System.out.println(Math.floor(4.999999));
        System.out.println(Math.floor(4.0));

        // 四舍五入
        System.out.println(Math.round(3.49999));
        System.out.println(Math.round(3.500001));

        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));

        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(3, 2));

        // [0.0,1.0)
        System.out.println(Math.random());

    }
}
