package com.itheima.d7_enum2;

public class Test {
    public static void main(String[] args) {
        check(Constant2.BOY);
    }

    public static void check(Constant2 sex){
        switch (sex){
            case BOY:
                System.out.println("游戏");
                break;
            case GIRL:
                System.out.println("土豪");
                break;
        }
    }
}
