package com.xyq.homework;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        System.out.println("游戏马上开始，请准备，按 Enter 开始。");

        Scanner sc = new Scanner(System.in);
        sc.nextLine(); // 让程序停在这里

        // 游戏开始
        // 准备一个游戏结束的时间
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) + 5);
        Date end = cal.getTime(); //  结束时间
        long endLong = end.getTime(); // 结束时间的时间戳（Long）

        int count = 0;
        while (endLong - new Date().getTime() >= 0) {
            sc.nextLine(); // 停一下，等待用户输入 enter
            System.out.println("你按了");
            count++;
        }

        // 计算一共按了多少次
        System.out.println("您在 5 秒之内一共按了 " + count + "次");

        double pin = count / 5.0;

        // 把频率进行格式化
        DecimalFormat df = new DecimalFormat((".00"));
        System.out.println("您的手速是：" + df.format(pin) + "次/秒");
    }
}