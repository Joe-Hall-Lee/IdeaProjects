package com.xyq.decimal;

import java.text.DecimalFormat;

public class Test {

    public static void main(String[] args) {
        double d = 10 / 3.0;

        System.out.println(d);

        // . 小数点
        // 0 和 # 表示数字

        // 保留两位小数
        DecimalFormat df = new DecimalFormat(".##");

        String s = df.format(d);
        System.out.println(s);
    }
}