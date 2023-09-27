package com.itheima.d14_constructor;

public class Test3 {
    public static void main(String[] args) {
        // 类在构造器中，通过this（）调用兄弟构造器
        Student s1 = new Student("李四", 26, "BUPT");

        Student s2 = new Student("张三",28,"黑马程序员");
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getSchoolName());
    }
}

class Student{
    private String name;
    private int age;
    private String schoolName;

    public Student() {
    }

    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.schoolName = "黑马程序员";
        this(name,age,"黑马程序员");
    }

    public Student(String name, int age, String schoolName) {
        super();
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
