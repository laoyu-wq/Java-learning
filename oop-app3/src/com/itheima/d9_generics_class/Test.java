package com.itheima.d9_generics_class;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("java1");
        list.add("java2");
        String ele = list.get(1);
        System.out.println(ele);

        MyClass2<Cat, String> c2 = new MyClass2<>();
//        c2.put();

        MyClass3<Animal> c3 = new MyClass3<>();
        MyClass3<Dog> c4 = new MyClass3<>();
    }
}
