package com.xyq.str;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("�������������");

        String name = sc.nextLine();

//        if (name.startsWith("��")) {
//            System.out.println("�ǵ�");
//        } else {
//            System.out.println("����");
//        }

        System.out.println(name.startsWith("��")?"�ǵ�":"����");
    }
}