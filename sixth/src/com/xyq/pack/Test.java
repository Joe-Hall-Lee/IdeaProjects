package com.xyq.pack;

public class Test {
    public static void main(String[] args) {
        // int i = 10;

        // System.out.println(i + 10);

        // System.out.println(i.toString()); // int ����û�м̳� Object
        // ��������������û����������������

        // Java �ṩ�����������͵İ�װ��

//        Integer i = new Integer(10); // ������װ��Ķ���
//
//        Integer ii = 10; // �Զ����
//
//        System.out.println(i + 20); // ��ʹ���ϣ�int �� Integer ��ʵû����
//        System.out.println(ii + 20);
//
//        int j = ii; // �Զ����
//
//        System.out.println(j + 100);

//        String a = "1";
//        String b = "1";
//
//        System.out.println(a + b); // 11
//
//        int c = Integer.parseInt(a); // �ַ���ת���� int Ψһ�ķ���
//        int d = Integer.parseInt(b); // �ַ���ת���� int Ψһ�ķ���
//        System.out.println(c + d);

//
//        String e = "1.25";
//
//        double f = Double.parseDouble(e); // ���ַ���ת����һ�� double
//        System.out.println(f * 6);
        long l = Long.parseLong("12345667891234567"); // Number BigDecimal
        System.out.println(l);

        String str = "������������";
        char c = str.charAt(1);
        System.out.println(c);

    }
}