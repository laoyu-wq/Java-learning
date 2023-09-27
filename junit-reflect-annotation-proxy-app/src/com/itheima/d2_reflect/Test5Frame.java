package com.itheima.d2_reflect;

import org.junit.Test;

public class Test5Frame {
    @Test
    public void save() throws Exception {
        Student s1 = new Student("黑马吴彦祖",45,'男',
                180,"阅读");
        Teacher t1 = new Teacher("boniu",999.9);

        // 把任意对象的字段名和其对应的值等信息，保存到文件中去
        ObjectFrame.saveObject(s1);
        ObjectFrame.saveObject(t1);
    }
}
