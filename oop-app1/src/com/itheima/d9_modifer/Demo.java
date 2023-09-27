package com.itheima.d9_modifer;
// 同一个包下其他类，除了private均可
public class Demo {
    public static void main(String[] args) {
        Fu f = new Fu();
//        f.privateMethod();
        f.publicMethod();
        f.method();
        f.protectedMethod();
    }
}
