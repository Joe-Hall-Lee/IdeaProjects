package com.xyq.date;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

    public static void main(String[] args) {
        // Calendar cal = Calendar.getInstance();
        // System.out.println(cal);

        // 2023
        // 3
        // 5

//        cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 130); // 计算时间

//        System.out.println(cal.get(Calendar.YEAR));
//        System.out.println(cal.get(Calendar.MONTH) + 1); // 月份从 0 开始
//        System.out.println(cal.get(Calendar.DATE));
//        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
//        System.out.println(cal.get(Calendar.MINUTE));
//        System.out.println(cal.get(Calendar.SECOND));


//        System.out.println(cal.getTime()); // 拿到的是 Date 对象

        Date d = new Date();

        Calendar cal = Calendar.getInstance();

        cal.setTime(d); // 把 Date 转化成 Calendar 对象

        System.out.println(cal);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1); // 月份从 0 开始
        System.out.println(cal.get(Calendar.DATE));
    }
}