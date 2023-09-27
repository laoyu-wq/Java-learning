package com.itheima.d7_thread_communication;

import java.util.ArrayList;
import java.util.List;

public class Desk {
    private List<String> list = new ArrayList<>();
    public synchronized void put() {
        String name = Thread.currentThread().getName();
        try {
            if (list.size() == 0){
                list.add(name + "做的肉包子");
                System.out.println(name + "做了个肉包子");
                Thread.sleep(2000);
                // 唤醒别人，等待自己
                this.notifyAll();
                this.wait();
            } else {
                // 唤醒别人，等待自己
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void get() {
        try {
            String name = Thread.currentThread().getName();
            if (list.size() == 1){
                // 有包子，吃了
                System.out.println(name + "吃了:" + list.get(0));
                list.clear();
                Thread.sleep(1000);
                this.notifyAll();
                this.wait();
            }else {
                // 没有包子
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
