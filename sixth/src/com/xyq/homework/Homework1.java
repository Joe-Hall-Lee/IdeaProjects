package com.xyq.homework;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("������һ����ѧ���ʽ");
        String s = sc.nextLine(); // 6 + 2 + 1

        // ��ȡ���û������ÿһ������
        // ��ȥ���ո�
        s = s.replace(" ", "");

        String[] ss = s.split("\\+");

        int sum = 0;
        for (int i = 0; i < ss.length; i++) {
            int a = Integer.parseInt(ss[i]);

            sum += a;
        }

        System.out.println("���յĽ���ǣ�" + sum);
    }
}