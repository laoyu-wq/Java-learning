package com.itheima.d2_inner_class2;

public class Ouster {
    private int age;
    public static String schoolName;
    public static class Inner{
        private String name;
        public static int a;
        public void test(){

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static void test2(){
        System.out.println(schoolName);
//        System.out.println(age);
    }
}
