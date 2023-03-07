package com.xyq.entity;

public class Cat { // 类默认继承 Object
    String name;
    String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // 子类对父类提供的方法不满意，重写


    @Override
    public String toString() {
        return "我的猫是" + this.color + "颜色";
    }

    public static void main(String[] args) {
        Cat c = new Cat("小花", "绿色");

        // 直接打印这个 c
        System.out.println(c);
        // 默认打印对象，自动地执行这个对象中的 toString() 方法
        System.out.println(c.toString());
        // 默认的 toString() -> 包 + 类@内存地址
    }
}