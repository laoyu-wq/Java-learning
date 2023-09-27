package com.itheima.d10_interface_jdk8;

public interface A {
    // 1、默认方法：必须使用default修饰，默认会被public修饰
    //  实例方法：对象的方法，必须使用实现类的对象来访问
    default void test1(){
        System.out.println("默认方法");
    }

    // 2、私有方法：必须使用private修饰，jdk9开始才有的，只能在接口内部被调用
    private void test2(){
        System.out.println("==私有方法==");
    }

    // 3、静态方法：必须使用static修饰，必须用当前接口名调用
    static void test3(){
        System.out.println("==静态方法==");
    }

    void test4();
    void test5();
}
