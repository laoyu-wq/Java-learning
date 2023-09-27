package com.itheima.d1_inner_class1;

public class Outer {
    private String name;
    private int age = 99;
    public static String a;
    public class Inner{
        private String name;
//        public static String schoolName;//JDK 16以后才支持定义
        private int age = 88;

        public void test(){
            System.out.println(age);
            System.out.println(a);
            int age = 66;

            System.out.println(age);
            System.out.println(this.age);
            System.out.println(Outer.this.age);
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
