import java.util.Scanner;

public class TextIf_3 {
    public static void main(String[] args) {
        System.out.println("��������㶵���Ǯ��");
        Scanner sc = new Scanner(System.in);

        // ��ȡ��Ǯ
        double money = sc.nextDouble();


        if (money > 1000) {
            System.out.println("ϴԡ������ happy");
        } else if (money > 500) {
            System.out.println("ϴ�ų�Ҳ����");
        } else if (money > 200) {
            System.out.println("����֣���С��");
        } else {
            System.out.println("��������һ��������");
        }

        System.out.println("����");
    }
}
