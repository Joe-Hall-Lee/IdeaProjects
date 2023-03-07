package com.xyq.str;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // String s = "你好啊，我叫赛利亚";

        // System.out.println(s.charAt(0)); // 获取到第 0 个位置的字符

        // s.concat("哈哈哈"); // 在字符串 s 上进行拼接，拼接"哈哈哈"
        // System.out.println(s);

        // 字符串是不可变的数据类型
        // 几乎所有的字符串操作都会返回一个新字符串
        // String s1 = s.concat("哈哈哈"); // 在字符串 s 上进行拼接，拼接"哈哈哈"
        // System.out.println(s1);


        // String s = "苍老师特别喜欢樵夫";
        // System.out.println(s.contains("博多老师"));

        // System.out.println("赛利亚昨天回娘家".endsWith("娘家")); // 判断是否以 xxx 结尾
        // System.out.println("赛利亚今天从娘家回家".startsWith("赛利亚")); // 判断是否以 xxx 开头

        // 验证码
//        String veryfy_code = "Kmgn";
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("请输入验证码（"+veryfy_code+"）");
//
//        String userInput = sc.nextLine();
//
//        if (veryfy_code.equalsIgnoreCase(userInput)) { // 判断左右两端内容在忽略大小写的时候是否一致
//            System.out.println("OK!");
//        } else {
//            System.out.println("不 OK！");
//        }

        // String s = "你好啊";

        // System.out.println(s.indexOf("啊")); // 计算给出的字符串出现的位置


        // String s = "我的天啊123";
        // System.out.println(s.length());


        // String s = "周润发特别喜欢樵夫";

        // String s1 = s.replace("周润发","苍老师"); // 字符串替换
        // System.out.println(s1);


//        String s = "哈哈_呵呵_吼吼_哦no";
//        String[] ss = s.split("_");
//
//        System.out.println(ss[0]);
//        System.out.println(ss[1]);
//        System.out.println(ss[2]);
//        System.out.println(ss[3]);

//        String s = "今天天气还不错";
//        System.out.println(s.substring(2, 4)); // 前闭后开区间，2 能取到，4 取不到

//        String s = "      哈       哈       ";

//        System.out.println(s.trim()); // 去掉左右两端的空格

        int i = 10;
        System.out.println(String.valueOf(i));
        // 野路子
        System.out.println(i + "");
    }
}