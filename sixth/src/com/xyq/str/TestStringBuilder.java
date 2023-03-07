package com.xyq.str;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); // 一个空字符串 ""

        StringBuffer sb2 = new StringBuffer("王二麻子的麻子特别地麻");

        System.out.println(sb2);
        sb2.append("，李二麻子的麻子也很麻");

        sb2.insert(3, "哈哈哈");
        System.out.println(sb2);

        // 把 StringBuilder 转化成 String
        String s = sb2.toString();

        System.out.println(s);
    }
}