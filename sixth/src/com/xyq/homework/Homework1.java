package com.xyq.homework;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数学表达式");
        String s = sc.nextLine(); // 6 + 2 + 1

        // 获取到用户输入的每一个数字
        // 先去掉空格
        s = s.replace(" ", "");

        String[] ss = s.split("\\+");

        int sum = 0;
        for (int i = 0; i < ss.length; i++) {
            int a = Integer.parseInt(ss[i]);

            sum += a;
        }

        System.out.println("最终的结果是：" + sum);
    }
}