import java.util.Scanner;

public class TestIf_1 {
    public static void main(String[] args) {
        System.out.println("��������㶵���Ǯ��");
        Scanner sc = new Scanner(System.in);

        // ��ȡ��Ǯ
        double money = sc.nextDouble();

        // ϴԡҪ�õ�Ǯ
        double price = 1000;

        // �����ж�
        if (money > price) {
            System.out.println("���磬�����ȥ happy ��");
        }

        System.out.println("����");
    }
}
