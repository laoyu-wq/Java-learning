package com.itheima.d10_generics_interface;

import com.itheima.d9_generics_class.Animal;

import java.util.ArrayList;
import java.util.Arrays;

// 泛型接口
//public interface Data<T extends Animal> {
//    void add(T t);
//    ArrayList<T> getByName(String name);
//}
public interface Data<T> {
    void add(T t);
    ArrayList<T> getByName(String name);
}