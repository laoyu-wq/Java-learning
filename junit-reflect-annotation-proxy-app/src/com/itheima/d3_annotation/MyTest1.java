package com.itheima.d3_annotation;

public @interface MyTest1 {
    String aaa();
    boolean bbb() default true;
    String[] ccc();
}
