package com.xyq.entity;

public class Cat { // ��Ĭ�ϼ̳� Object
    String name;
    String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // ����Ը����ṩ�ķ��������⣬��д


    @Override
    public String toString() {
        return "�ҵ�è��" + this.color + "��ɫ";
    }

    public static void main(String[] args) {
        Cat c = new Cat("С��", "��ɫ");

        // ֱ�Ӵ�ӡ��� c
        System.out.println(c);
        // Ĭ�ϴ�ӡ�����Զ���ִ����������е� toString() ����
        System.out.println(c.toString());
        // Ĭ�ϵ� toString() -> �� + ��@�ڴ��ַ
    }
}