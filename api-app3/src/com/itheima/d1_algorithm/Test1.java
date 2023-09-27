package com.itheima.d1_algorithm;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        // 1、准备一个数组
        int[] arr = {5, 2, 3, 1};
        
        // 2、定义一个循环控制排几轮
        for (int i = 0; i < arr.length; i++) {
            // i = 0 1 2          [5, 2, 3, 1] 次数
            // i = 0 第一轮        0 1 2         3
            // i = 0 第二轮        0 1           2
            // i = 0 第三轮        0             1
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 判断当前位置的元素值，是否大于后一个位置处的元素值，如果大则交换。
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
