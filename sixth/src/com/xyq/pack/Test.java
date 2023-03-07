package com.xyq.pack;

public class Test {
    public static void main(String[] args) {
        // int i = 10;

        // System.out.println(i + 10);

        // System.out.println(i.toString()); // int 类型没有继承 Object
        // 基本数据类型是没有面向对象的特征的

        // Java 提供基础数据类型的包装类

//        Integer i = new Integer(10); // 创建包装类的对象
//
//        Integer ii = 10; // 自动打包
//
//        System.out.println(i + 20); // 在使用上，int 和 Integer 其实没区别
//        System.out.println(ii + 20);
//
//        int j = ii; // 自动解包
//
//        System.out.println(j + 100);

//        String a = "1";
//        String b = "1";
//
//        System.out.println(a + b); // 11
//
//        int c = Integer.parseInt(a); // 字符串转化成 int 唯一的方案
//        int d = Integer.parseInt(b); // 字符串转化成 int 唯一的方案
//        System.out.println(c + d);

//
//        String e = "1.25";
//
//        double f = Double.parseDouble(e); // 把字符串转化成一个 double
//        System.out.println(f * 6);
        long l = Long.parseLong("12345667891234567"); // Number BigDecimal
        System.out.println(l);

        String str = "哈哈哈哈哈哈";
        char c = str.charAt(1);
        System.out.println(c);

    }
}