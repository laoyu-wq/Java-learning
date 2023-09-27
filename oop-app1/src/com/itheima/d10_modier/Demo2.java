package com.itheima.d10_modier;

import com.itheima.d9_modifer.Fu;

public class Demo2 {
    // 其他包下任意类，只有public可以
    public static void main(String[] args) {
        Fu f = new Fu();
        f.publicMethod();
//        f.privateMethod();
//        f.protectedMethod();
//        f.method();
    }
}
