package com.xyq.entity;

public class Person {
    // ��Ա������˽�е�
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // setter
//    public void setName(String name) {
//        this.name = name;
//    }
//
    // ��Ч�ر������ǵĳ�Ա�����������ҵظ�ֵ
//    public void setAge(int age) {
//        if (age < 0) {
//            this.age = 0;
//        } else {
//            this.age = age;
//        }
//    }
//
    // getter
//    public String getName() {
//        return this.name;
//    }
//
//    public int getAge() {
//        return this.age;
//    }

    public void chi() {
        System.out.println(this.name + "�ڳԶ���");
    }
}