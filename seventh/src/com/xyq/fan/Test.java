package com.xyq.fan;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // List<String> strList = new ArrayList<String>();

        // strList.add("��������");
        // strList.add(123); // ������װ int
        // strList.add("���ෲ��");
        // strList.add("���׷��");

        // String s = strList.get(1); // ����Ҫǿת��

        // System.out.println(s);

//        List<Singer> list = new ArrayList<Singer>();
//
//        list.add(new Singer(1, "������", 1.25, "ֻ����̫��"));
//        list.add(new Singer(2, "���ෲ", 1.25, "�ִ���Բ"));
//        list.add(new Singer(3, "¹��", 1.25, "sorry"));
//        list.add(new Singer(4, "���׷�", 1.25, "sorry"));
//
//        Iterator<Singer> it = list.iterator();
//
//        while (it.hasNext()) {
//            Singer s = it.next();
//            System.out.println(s.getName());
//            System.out.println(s.getSong());
//        }

        Map<String, String> map = new HashMap<String, String>();

        map.put("��̳���", "�ҵ��");
        map.put("����ţ��", "������");
        map.put("��������±", "�ҳ����ѳԵ�����");

        map.put("����", "������պϰ�");

        String s = map.get("��̳���");
        System.out.println(s);
    }
}