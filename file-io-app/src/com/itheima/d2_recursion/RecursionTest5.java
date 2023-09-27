package com.itheima.d2_recursion;

public class RecursionTest5 {
    public static int totalNumber;
    public static int lastBottleNumber;
    public static int lastCoverNumber;
    public static void main(String[] args) {
        buy(10);
        System.out.println("总数：" + totalNumber);
        System.out.println("剩余盖子数：" + lastCoverNumber);
        System.out.println("剩余瓶子数：" + lastBottleNumber);
    }
    public static void buy(int money){
        // 1、先买了再说
        int buyNumber = money / 2;
        totalNumber += buyNumber;

        // 2、把盖子和瓶子换算成钱继续买
        // 计算本轮总的盖子和瓶子数
        int allBottleNumber = buyNumber + lastBottleNumber;
        int allCoverNumber = buyNumber + lastCoverNumber;

        int allMoney = 0;

        if (allBottleNumber >= 2){
            allMoney += (allBottleNumber / 2) * 2;
        }
        lastBottleNumber = allBottleNumber % 2;

        if (allBottleNumber >= 4){
            allMoney += (allCoverNumber / 4) * 2;
        }
        lastCoverNumber = allCoverNumber % 4;

        if (allMoney >= 2){
            buy(allMoney);
        }
    }
}
