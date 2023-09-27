package com.itheima.d11_interface_attention;

public class Test {
    public static void main(String[] args) {

    }
}

interface A{
    void test();
}
interface B{
    void test2();
}
interface C{}

// 接口是多继承的
interface D extends C,B,A{

}
class E implements C,B,A{
    @Override
    public void test() {

    }

    @Override
    public void test2() {

    }
}