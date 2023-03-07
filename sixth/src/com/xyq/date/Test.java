package com.xyq.date;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        Date d = new Date(); // 系统时间

        System.out.println(d);

        System.out.println(d.getYear() + 1900); // 从 1990 年开始算的
        System.out.println(d.getMonth() + 1); // 月份从 0 开始
        System.out.println(d.getDate()); // 17

        System.out.println(d.getHours()); // 小时
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());

        // 重点
        System.out.println(d.getTime()); // 获取到事件的毫秒表示形式，返回的是 long
    }
}