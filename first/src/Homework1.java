import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(100); // n ��һ�����������Χ�� [0, 99]

        Scanner sc = new Scanner(System.in);

        boolean flag = true; // ׼��һ��״̬

        while (flag) {
            System.out.println("������һ������ a��");
            int a = sc.nextInt();

            // �ж�
            if (a > n) {
                System.out.println("�Բ��𣬲´���");
            } else if (a < n) {
                System.out.println("�Բ��𣬲�С��");
            } else { // ����
                System.out.println("��ϲ�㣬�¶���");
                flag = false;
            }
        }

    }
}