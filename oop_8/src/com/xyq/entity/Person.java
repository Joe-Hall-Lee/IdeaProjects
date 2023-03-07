package com.xyq.entity;

public class Person {
    public String pub = "public"; // 公共的
    private String pri = "private"; // 私有的
    String def = "default"; // 包内的

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.pub);
        System.out.println(p.pri);
        System.out.println(p.def);
    }
}