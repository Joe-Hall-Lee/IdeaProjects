package com.xyq.math;

import java.util.Scanner;

public class TestMath {

    public static void main(String[] args) {
//        System.out.println(Math.abs(-12)); // 12
//        System.out.println(Math.abs(12)); // 12
//
//        System.out.println(Math.max(1, 18)); // 18
//        System.out.println(Math.min(98, 108)); // 98
//
//
//        System.out.println(Math.pow(3, 3)); // 3 * 3 * 3 27
//
//        System.out.println(Math.round(4.7)); // 5
//        System.out.println(Math.round(3.2)); // 3
//
//        System.out.println(Math.sqrt(9)); // 3 平方根

        System.out.println("计算一元二次方程的解");
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入 a：");
        double a = sc.nextInt();

        System.out.println("请输入 b：");
        double b = sc.nextInt();

        System.out.println("请输入 c：");
        double c = sc.nextInt();

        double dt = Math.pow(b, 2) - 4 * a * c;

        if (dt < 0) {
            System.out.println("无解");
        } else if (dt == 0) {
            System.out.println("此方程只有一个解");

            double x = (-b) / (2 * a);
            System.out.println("解 x = " + x);
        } else {
            System.out.println("此方程有两个解");
            double x1 = (-b + Math.sqrt(dt)) / (2 * a);
            double x2 = (-b - Math.sqrt(dt)) / (2 * a);

            System.out.println("解：x1 = " + x1);
            System.out.println("解：x2 = " + x2);
        }
    }
}