package com.itheima.d8_interface2;

public class Test {
    public static void main(String[] args) {
        Singer s = new A();
        s.single();
        Driver d = new A();
        d.drive();
        Driver d2 = new B();
        d2.drive();
    }
}
class B implements Driver{
    @Override
    public void drive() {

    }
}
class A extends Student implements Driver,Singer{
    @Override
    public void drive() {

    }

    @Override
    public void single() {

    }
}

class Student{

}

interface Driver{
    void drive();
}

interface Singer{
    void single();
}
