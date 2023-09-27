package com.itheima.d4_abstract;

public abstract class A {
    private String name;
    public static String schoolName;

    public A() {
    }

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        A.schoolName = schoolName;
    }

    public abstract void run();
}
