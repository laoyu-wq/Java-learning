package com.itheima.d3_final;

public class Test {
    /*
        常量：public static final修饰的成员变量，建议名称全部大写，多个单词下划线连接
    */
    public static final String SCHOOL_NAME = "黑马";
    public static void main(String[] args) {
        // 目标：认识final的作用
        // 3、final可以修饰变量总规则：有且只能赋值一次
        /*
            变量：
             一、局部变量
             二、成员变量
                1、静态成员变量
                2、实例成员变量
         */
        final int a;
        a = 12;
//        a = 13;

        final double r = 3.14;
//        r = 0.1
    }
    public static void buy(final double z){
//        z = 0.1;
    }
}

// 1、final修饰类，类不能被继承
final class A{}
//class B extends A{}

// 2、final修饰方法，方法不能被重写
class C{
    public final void test(){}
}
class D extends C{
//    @Override
//    public void test(){}
}