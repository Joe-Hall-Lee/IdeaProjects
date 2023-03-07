package com.xyq.str;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你的名字");

        String name = sc.nextLine();

//        if (name.startsWith("张")) {
//            System.out.println("是的");
//        } else {
//            System.out.println("不是");
//        }

        System.out.println(name.startsWith("张")?"是的":"不是");
    }
}