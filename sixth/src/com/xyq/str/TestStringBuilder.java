package com.xyq.str;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); // һ�����ַ��� ""

        StringBuffer sb2 = new StringBuffer("�������ӵ������ر����");

        System.out.println(sb2);
        sb2.append("��������ӵ�����Ҳ����");

        sb2.insert(3, "������");
        System.out.println(sb2);

        // �� StringBuilder ת���� String
        String s = sb2.toString();

        System.out.println(s);
    }
}