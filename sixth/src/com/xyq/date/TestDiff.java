package com.xyq.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDiff {

    public static void main(String[] args) throws Exception {
        String s1 = "2018-01-01 12:00:00"; // 开始时间
        String s2 = "2018-01-01 14:45:00"; // 结束时间

        // 格式化时间的工具
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 把字符串转化成时间
        Date d1 = sdf.parse(s1);
        Date d2 = sdf.parse(s2);

        // 转化成 long 类型的事件
        long long1 = d1.getTime();
        long long2 = d2.getTime();

        long diff = Math.abs(long1 - long2); // 计算毫秒级别的时间差，求绝对值

        // 秒级别的时间差
        long diffSec = diff / 1000;

        // 分钟级别时间差
        long diffMin = diffSec / 60; // 105 分钟 / 60

        // 显示成 xxx 小时 xxx 分钟
        long diffHourDisplay = diffMin / 60; // 1 小时
        long diffMinDisplay = diffMin % 60; // 45 分钟


        System.out.println("您一共玩儿了 "+diffHourDisplay+" 小时 "+diffMinDisplay+" 分钟");
    }
}