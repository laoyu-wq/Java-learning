package com.itheima.d3_annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationTest3 {
    @Test
    public void parseClass() throws Exception {
        // 1、先得到Class对象
        Class c = Demo.class;
        Method m = c.getDeclaredMethod("test1");
        // 2、解析类上的注解
        // 判断类上是否包含了某个注解
        if (c.isAnnotationPresent(MyTest4.class)){
//            Annotation myTest4 = c.getDeclaredAnnotation(MyTest4.class);
            MyTest4 myTest4 = (MyTest4) c.getDeclaredAnnotation(MyTest4.class);
            System.out.println(myTest4.value());
            System.out.println(myTest4.aaa());
            System.out.println(Arrays.toString(myTest4.bbb()));
        }
        // 判断方法对象上是否包含了某个注解
        if (m.isAnnotationPresent(MyTest4.class)){
            MyTest4 myTest4 = (MyTest4) m.getDeclaredAnnotation(MyTest4.class);
            System.out.println(myTest4.value());
            System.out.println(myTest4.aaa());
            System.out.println(Arrays.toString(myTest4.bbb()));
        }
    }
}
