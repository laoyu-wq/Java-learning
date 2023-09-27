package com.itheima.d1_algorithm;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        // 1、准备好一个数组
        int[] arr = {5, 1, 3, 2};

        // 2、控制选择几轮
//        for (int i = 0; i < arr.length; i++) {
//            // i = 0 第一轮 j = 1 2 3
//            // i = 1 第二轮 j = 2 3
//            // i = 2 第三轮 j = 3
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            // i = 0 第一轮 j = 1 2 3
            // i = 1 第二轮 j = 2 3
            // i = 2 第三轮 j = 3
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if (i != minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
