package com.xyq.simple;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("������һ��ʱ�䣨yyyy-MM-dd HH:mm:ss����");

        String s = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date d = sdf.parse(s); // ���ַ���ת����ʱ��

        System.out.println(d);
    }
}