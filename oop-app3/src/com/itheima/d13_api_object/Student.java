package com.itheima.d13_api_object;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 重写equals方法,比较两个对象是否地址一样就返回true
    // 比较者：s2 == this
    // 被比较者：s1 == o
    @Override
    public boolean equals(Object o) {
        // 判断地址是否相同
        if (this == o) return true;
        // 判断o是null直接返回false，或者比较者和被比较者的类型不一样，返回flase
        if (o == null || getClass() != o.getClass()) return false;
        // o不是null，且o一定是学生类型的对象。开始比较内容了
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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


}
