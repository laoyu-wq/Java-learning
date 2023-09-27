package com.itheima.d8_extends_application;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("波仔");
        t.setSkill("Java,Spring");
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        t.printInfo();
    }
}
