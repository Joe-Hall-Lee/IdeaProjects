import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("������һ����λ����");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {
            // ��ȡ����λ����ÿһλ
            int bai = num / 100; // ��λ 298 % 100 = 98 % 10 = 9......8
            int shi = num % 100 / 10; // ʮλ
            int ge = num % 100 % 10; // ��λ

            int sum = bai * bai * bai + shi * shi * shi + ge * ge * ge;

            if (num == sum) {
                System.out.println("ˮ�ɻ���");
            } else {
                System.out.println("����ˮ�ɻ���");
            }
        } else {
            System.out.println("����ˮ�ɻ���");
        }
    }
}
