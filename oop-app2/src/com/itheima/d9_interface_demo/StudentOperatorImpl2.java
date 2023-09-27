package com.itheima.d9_interface_demo;

import java.util.ArrayList;

public class StudentOperatorImpl2 implements StudentOperator{
    @Override
    public void printInfo(ArrayList<Student> students) {
        System.out.println("--------------全部学生信息--------------");
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名：" + s.getName() + "，性别：" + s.getSex() + "，成绩：" + s.getScore());
            if (s.getSex() == '男'){
                count1++;
            }
            if (s.getSex() == '女'){
                count2++;
            }
        }
        System.out.println("男生人数是：" + count1 + ",女生人数是" + count2);
        System.out.println("班级总人数是：" + students.size());
        System.out.println("----------------------------");
    }

    @Override
    public void printScore(ArrayList<Student> students) {
        double allScore = 0.0;
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            allScore += s.getScore();
            if (s.getScore() > max)
                max= s.getScore();
            if (s.getScore() < min)
                min= s.getScore();
        }
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均分：" + (allScore) / students.size());
    }
}
