package com.xyq.iter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("������");
        list.add("���ෲ");
        list.add("���׷�");
        list.add("¹��");

        // ����������������һ��ҽ��
        Iterator it = list.iterator();

//        String s0 = (String) it.next(); // ��һ��
//        System.out.println(s0);
//        String s1 = (String) it.next(); // ��һ��
//        System.out.println(s1);
//        String s2 = (String) it.next(); // ��һ��
//        System.out.println(s2);
//        String s3 = (String) it.next(); // ��һ��
//        System.out.println(s3);
//
//        String s4 = (String) it.next(); // û��Ԫ���ˣ��ٽ���һ����û���ˣ�������
//        System.out.println(s4);

        while (it.hasNext()) { // �ж���û����һ��Ԫ��
            String s = (String) it.next(); // ����һ��Ԫ��
            System.out.println(s);
        }

        System.out.println(it.next());
    }
}