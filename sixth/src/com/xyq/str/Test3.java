package com.xyq.str;

public class Test3 {

    public static void main(String[] args) {
        String[] stus = {"С��_��ѧ_12_����_33_Ӣ��_42", "�ֹ���_��ѧ_25_����_56_Ӣ��_27", "̩˹����_��ѧ_99_����_88_Ӣ��_120"};


        for (int i = 0; i < stus.length; i++) { // ���� length û������
            String s = stus[i];

            String[] ss = s.split("_"); // С��, ��ѧ, 12, ����, 33, Ӣ��, 42

            String name = ss[0];
            String shuxue = ss[2];
            String yuwen = ss[4];
            String yingyu = ss[6];

            double avq = (Integer.parseInt(shuxue) + Integer.parseInt(yuwen) + Integer.parseInt(yingyu)) / 3.0;

            System.out.println(name + "��ƽ������" + avq);


        }
    }
}