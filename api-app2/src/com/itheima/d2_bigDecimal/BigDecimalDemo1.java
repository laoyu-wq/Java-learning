package com.itheima.d2_bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        // 使用此类解决小数运算失真问题
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        System.out.println("-----------------------------");

//        BigDecimal a1 = new BigDecimal(Double.toString(a));
//        BigDecimal b1 = new BigDecimal(Double.toString(b));
        // 推荐以下方式，小数点转换成字符串再得到BigDecimal对象来使用
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

//        BigDecimal c1 = a1.add(b1);
//        BigDecimal c1 = a1.subtract(b1);
//        BigDecimal c1 = a1.multiply(b1);
        BigDecimal c1 = a1.divide(b1);
        System.out.println(c1);

        BigDecimal i = BigDecimal.valueOf(0.1);
        BigDecimal j = BigDecimal.valueOf(0.3);
        BigDecimal k = i.divide(j, 2, RoundingMode.HALF_UP);
        System.out.println(k);

        // BigDecimal对象转换成double类型的数据
        double rs = k.doubleValue();
        System.out.println(rs);
    }
}
