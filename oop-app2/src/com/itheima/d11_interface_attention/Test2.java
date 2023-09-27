package com.itheima.d11_interface_attention;

import java.security.PublicKey;

public class Test2 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.run();
    }
}
// 1、一个接口继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承
interface I{
    void test1();
}
interface J{
    String test1();
}
//interface K extends I,J{}
// 2、一个类实现多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承
//class E extends I,J{}

// 3、一个类继承了父类，又同时实现了接口，父类中和接口中有同名的默认方法，实现类会优先使用父类的
class Fu{
    public void run(){
        System.out.println("==父类的run==");
    }
}
interface IT{
    default void run(){
        System.out.println("==接口IT中的run方法执行了==");
    }
}
class Zi extends Fu implements IT{

}

// 4、一个类实现了多个接口，多个接口存在同名的默认方法，可以不冲突，重写该方法即可
interface It1{
    default void test(){
        System.out.println("IT1");
    }
}
interface It2{
    default void test(){
        System.out.println("IT2");
    }
}
class N implements It1,It2{
    @Override
    public void test() {
        System.out.println("我自己");
    }
}