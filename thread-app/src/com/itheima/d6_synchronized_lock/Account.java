package com.itheima.d6_synchronized_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money;//余额

    // 创建一个锁对象
    private final Lock lk = new ReentrantLock();// 加了final之后不能二次赋值了

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public static void test(){
        synchronized (Account.class){

        }
    }

    public void drawMoney(double money) {
        // 先搞清楚谁来取钱
        // this正好代表共享资源

        String name = Thread.currentThread().getName();
        try {
            lk.lock();
            if (this.money >= money){
                System.out.println(name + "来取钱" + money + "成功!");
                this.money -= money;
                System.out.println(name + "来取钱后，余额剩余：" + this.money);
            }else {
                System.out.println(name + "来取钱，余额不足~");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lk.unlock();
        }
    }
}
