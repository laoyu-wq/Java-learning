package com.itheima.d5_arrays;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class ArraysTest1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(arr));

        int[] arr2 = Arrays.copyOfRange(arr,1,4);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOf(arr,3);
        System.out.println(Arrays.toString(arr3));

        double[] prices = {99.8, 128, 100};
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return prices[value] * 0.8;
            }
        });
        System.out.println(Arrays.toString(prices));

        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
    }
}
