package com.itheima.d6_abstract_template;
    /*
        设计模板方法设计模式
        1、定义一个模板方法出来
    */
public abstract class People {
    // 防止子类重写
    public final void write(){
        System.out.println("我的爸爸");
        System.out.println(writeMain());
        System.out.println("太好了");
    }

    public abstract String writeMain();
}
