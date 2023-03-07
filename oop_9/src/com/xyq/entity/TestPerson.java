package com.xyq.entity;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();
        // p.name = "周润发";
        // p.age = -1; // 语法没有问题，但是，逻辑上有重大问题

        p.setName("周润发");
        p.setAge(-1);

        // 查看这个人的名字和年龄
        System.out.println(p.getName());
        System.out.println(p.getAge());

        p.chi();
    }
}