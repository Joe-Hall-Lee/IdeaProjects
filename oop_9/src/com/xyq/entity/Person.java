package com.xyq.entity;

public class Person {
    // 成员变量是私有的
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
    // 有效地保护我们的成员变量不被胡乱地赋值
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
        System.out.println(this.name + "在吃东西");
    }
}