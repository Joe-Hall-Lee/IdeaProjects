package com.xyq.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // ���д�
        List li = new ArrayList();
        li.add("������");
        li.add("����Ұ����");
        li.add("��ľ����");
        li.add("����ϣ");

        // ���û�������������
        Scanner sc = new Scanner(System.in);

        System.out.println("�����������������ݣ�");
        String content = sc.nextLine();

        for (int i = 0; i < li.size(); i++) {
            String ci = (String) li.get(i); // �õ����д�
            if (content.contains(ci)) { // �ж��Ƿ�������д�

                // ƴ�� *
                String s = "";
                for (int j = 0; j < ci.length(); j++) {
                    s += "*";
                }

                // �滻���д�
                content = content.replace(ci, s);
            }
        }

        System.out.println(content);
    }
}