import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        // 1������һ��ɨ����
        // Scanner sc = new Scanner(System.in);

        // 2��ʹ��ɨ��������ȡ���û����������
        // int a = sc.nextInt(); // ��ȡ������
        // System.out.println(a);

        // double d = sc.nextDouble(); // С��
        // System.out.println("d = " + d);

        // String s = sc.nextLine(); // ��ȡ���ַ���
        // System.out.println(s);

        // ���û�������������a��b������ a + b �Ľ��
        Scanner sc = new Scanner(System.in);

        System.out.println("������ a �� b��");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a + b = " + (a + b));

    }
}
