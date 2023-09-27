package com.itheima.d3_thread_safe;

public  class DrawThread extends Thread{
    private Account acc;

    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }
    // 取钱

    @Override
    public void run() {
        // 取钱（小明，小红）
        acc.drawMoney(100000);
    }
}
