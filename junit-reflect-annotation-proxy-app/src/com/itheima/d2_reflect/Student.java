package com.itheima.d2_reflect;

public class Student extends Object{
    private String name;
    private int age;

    private char sex;
    private double height;
    private String hobby;

    public Student() {
    }

//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public Student(String name, int age, char sex, double height, String hobby) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
