package com.xyq.dao;

import com.xyq.entity.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.pub); // 公共的
        // System.out.println(p.pri); // 私有的
        // System.out.println(p.def); // 包访问权限
    }
}