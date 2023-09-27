package com.itheima.d9_interface_demo;

import java.util.ArrayList;

public class ClassManager {
    private ArrayList<Student> students = new ArrayList<>();
    private StudentOperator studentOperator = new StudentOperatorImpl2();
    public ClassManager(){
        students.add(new Student("迪丽热巴",'女',99));
        students.add(new Student("古力娜扎",'女',100));
        students.add(new Student("马儿扎哈",'男',80));
        students.add(new Student("卡尔扎巴",'男',60));
    }
    public void printInfo(){
        studentOperator.printInfo(students);
    }
    public void printScore(){
        studentOperator.printScore(students);
    }
}
