package com.itheima.d10_modier;

import com.itheima.d9_modifer.Fu;
// 其他包下子类 public和protected可以
public class Zi extends Fu {
    public void test(){
        protectedMethod();
        publicMethod();
    }
}
