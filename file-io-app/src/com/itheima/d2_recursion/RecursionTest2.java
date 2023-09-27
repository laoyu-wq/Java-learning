package com.itheima.d2_recursion;

public class RecursionTest2 {
    public static void main(String[] args) {
        System.out.println(f(1));
        System.out.println(f(2));
        System.out.println(f(3));
    }

    public static int f(int x){
        if (x == 10){
            return 1;
        } else {
            return 2 + f(x + 1) + 2;
        }
    }
}
