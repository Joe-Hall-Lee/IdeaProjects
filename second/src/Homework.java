import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("�����뼦��������");
//        int m = sc.nextInt();
//
//        System.out.println("���������ӵ�������");
//        int n = sc.nextInt();
//
//        int total = m * 2 + n * 4;
//        System.out.println("������һ���� " + total + " ֻ��");

        System.out.println("������ŵ�������");
        int foot = sc.nextInt();

        for (int ji = 0; ji <= foot / 2; ji++) { // ��
            int tu_jiao = foot - ji * 2; // �����ӵĽ�

            if (tu_jiao % 4 == 0) { // ��������װ����
                System.out.println("�м� " + ji + " ֻ�������� " + tu_jiao / 4 + " ֻ");
            }
        }
    }
}