package com.xyq.date;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        Date d = new Date(); // ϵͳʱ��

        System.out.println(d);

        System.out.println(d.getYear() + 1900); // �� 1990 �꿪ʼ���
        System.out.println(d.getMonth() + 1); // �·ݴ� 0 ��ʼ
        System.out.println(d.getDate()); // 17

        System.out.println(d.getHours()); // Сʱ
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());

        // �ص�
        System.out.println(d.getTime()); // ��ȡ���¼��ĺ����ʾ��ʽ�����ص��� long
    }
}