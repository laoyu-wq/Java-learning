package com.itheima.d4_collection_set;

public class SetTest2 {
    public static void main(String[] args) {
        Student s1 = new Student("蜘蛛精",25,169.5);
        Student s2 = new Student("紫霞",22,166.5);
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String str1 = new String("abc");
        String str2 = new String("acD");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
