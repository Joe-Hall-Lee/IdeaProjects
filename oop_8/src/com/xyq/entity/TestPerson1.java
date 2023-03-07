package com.xyq.entity;

public class TestPerson1 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.pub);
        // System.out.println(p.pri); // 私有内容不好使了
        System.out.println(p.def);
    }
}