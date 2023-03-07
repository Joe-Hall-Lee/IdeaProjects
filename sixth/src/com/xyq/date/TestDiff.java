package com.xyq.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDiff {

    public static void main(String[] args) throws Exception {
        String s1 = "2018-01-01 12:00:00"; // ��ʼʱ��
        String s2 = "2018-01-01 14:45:00"; // ����ʱ��

        // ��ʽ��ʱ��Ĺ���
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // ���ַ���ת����ʱ��
        Date d1 = sdf.parse(s1);
        Date d2 = sdf.parse(s2);

        // ת���� long ���͵��¼�
        long long1 = d1.getTime();
        long long2 = d2.getTime();

        long diff = Math.abs(long1 - long2); // ������뼶���ʱ�������ֵ

        // �뼶���ʱ���
        long diffSec = diff / 1000;

        // ���Ӽ���ʱ���
        long diffMin = diffSec / 60; // 105 ���� / 60

        // ��ʾ�� xxx Сʱ xxx ����
        long diffHourDisplay = diffMin / 60; // 1 Сʱ
        long diffMinDisplay = diffMin % 60; // 45 ����


        System.out.println("��һ������� "+diffHourDisplay+" Сʱ "+diffMinDisplay+" ����");
    }
}