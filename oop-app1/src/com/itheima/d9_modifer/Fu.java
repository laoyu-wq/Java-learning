package com.itheima.d9_modifer;

public class Fu {
    // 1、私有：只能在本类中访问
    private void privateMethod(){
        System.out.println("==private==");
    }

    void method(){
        System.out.println("==缺省==");
    }
    protected void protectedMethod(){
        System.out.println("==protected==");
    }
    public void publicMethod(){
        System.out.println("==public==");
    }

    public void test(){
        privateMethod();
        method();
        protectedMethod();
        publicMethod();
    }
}
