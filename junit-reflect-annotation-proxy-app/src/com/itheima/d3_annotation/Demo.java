package com.itheima.d3_annotation;

@MyTest4(value = "蜘蛛精",aaa = 99.5,bbb = {"Python","Java"})
public class Demo {
    @MyTest4(value = "孙悟空",aaa = 199.5,bbb = {"c++","Java"})
    public void test1(){}
}
