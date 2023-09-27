package com.itheima.d5_arrays;

public class Student implements Comparable<Student>{
    private String name;
    private double height;
    private int age;

    public Student() {
    }

    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
//        if (this.age > o.age)
//            return 1;
//        else if (this.age < o.age) {
//            return -1;
//        }
//        return 0;
        return this.age - o.age; // 升序

    }
}
