package com.itheima.d10_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo01 {
    public static void main(String[] args) throws InterruptedException {
        List<String> gift = new ArrayList<>();
        String[] names = {"口红","包包","鲜花","剃须刀","皮带","手表"};
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            gift.add(names[r.nextInt(names.length)] + (i + 1));
        }
        System.out.println(gift);

        SendThread xm = new SendThread(gift,"小明");
        xm.start();
        SendThread xh = new SendThread(gift,"小红");
        xh.start();


        xm.join();
        xh.join();


        System.out.println(xm.getCount());
        System.out.println(xh.getCount());
    }
}
