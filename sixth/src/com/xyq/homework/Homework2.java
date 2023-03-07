package com.xyq.homework;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        System.out.println("��Ϸ���Ͽ�ʼ����׼������ Enter ��ʼ��");

        Scanner sc = new Scanner(System.in);
        sc.nextLine(); // �ó���ͣ������

        // ��Ϸ��ʼ
        // ׼��һ����Ϸ������ʱ��
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) + 5);
        Date end = cal.getTime(); //  ����ʱ��
        long endLong = end.getTime(); // ����ʱ���ʱ�����Long��

        int count = 0;
        while (endLong - new Date().getTime() >= 0) {
            sc.nextLine(); // ͣһ�£��ȴ��û����� enter
            System.out.println("�㰴��");
            count++;
        }

        // ����һ�����˶��ٴ�
        System.out.println("���� 5 ��֮��һ������ " + count + "��");

        double pin = count / 5.0;

        // ��Ƶ�ʽ��и�ʽ��
        DecimalFormat df = new DecimalFormat((".00"));
        System.out.println("���������ǣ�" + df.format(pin) + "��/��");
    }
}