package com.xyq.entity;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();
        // p.name = "����";
        // p.age = -1; // �﷨û�����⣬���ǣ��߼������ش�����

        p.setName("����");
        p.setAge(-1);

        // �鿴����˵����ֺ�����
        System.out.println(p.getName());
        System.out.println(p.getAge());

        p.chi();
    }
}