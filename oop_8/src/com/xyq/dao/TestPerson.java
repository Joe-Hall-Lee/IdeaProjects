package com.xyq.dao;

import com.xyq.entity.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.pub); // ������
        // System.out.println(p.pri); // ˽�е�
        // System.out.println(p.def); // ������Ȩ��
    }
}