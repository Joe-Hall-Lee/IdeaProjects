package com.xyq.entity;

public class Person {
    public String pub = "public"; // ������
    private String pri = "private"; // ˽�е�
    String def = "default"; // ���ڵ�

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.pub);
        System.out.println(p.pri);
        System.out.println(p.def);
    }
}