package com.itheima.d12_extends_override;

public class B extends A{
    // 子类重写父类方法时，访问权限必须大于等于父类权限（public > protected > 缺省）
    // 静态和私有方法不能被重写
    @Override
    public void print1(){
        System.out.println("666");
    }
    @Override // 安全，可读性好
    public void print2(int a,int b){
        System.out.println("666666");
    }
}
