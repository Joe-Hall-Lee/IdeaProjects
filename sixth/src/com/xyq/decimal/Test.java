package com.xyq.decimal;

import java.text.DecimalFormat;

public class Test {

    public static void main(String[] args) {
        double d = 10 / 3.0;

        System.out.println(d);

        // . С����
        // 0 �� # ��ʾ����

        // ������λС��
        DecimalFormat df = new DecimalFormat(".##");

        String s = df.format(d);
        System.out.println(s);
    }
}