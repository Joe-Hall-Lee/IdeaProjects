import java.util.Scanner;

public class TextIf_2 {
    public static void main(String[] args) {
        System.out.println("��������㶵���Ǯ��");
        Scanner sc = new Scanner(System.in);

        // ��ȡ��Ǯ
        double money = sc.nextDouble();
        if (money > 1000) {
            System.out.println("���磬�����ȥ happy ��");
        } else {
            System.out.println("���磬�����Ǯ��");
        }

        System.out.println("����");
    }
}
