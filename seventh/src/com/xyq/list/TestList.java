package com.xyq.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List list = new LinkedList();

        list.add("������");
        list.add("С����");
        list.add("��ʦ��");
        list.add("��˧��");

//        System.out.println(list);
//
//        list.remove("С����");
//        System.out.println(list);
//
//        System.out.println(list.size());
//
//        Object obj = list.get(1); // �б���±�Ҳ�Ǵ� 0 ��ʼ��
//        String s = (String)obj;
//
//        System.out.println(s);
//
//        System.out.println(list.contains("����"));


        for (int i = 0; i < list.size(); i++) {
            String s = (String) list.get(i); // ����ת�ͣ�ǿת
            System.out.println(s);
        }
    }
}