public class Var2 {
    public static void main(String[] args) {
        double price = 1.25;

        System.out.println(price);

        // ���� = 10086;
        // ���� = 10010;
        // �Ǽ��� 1.4 ��
        price = price + 0.15; // = ��ʾ��ֵ

        System.out.println(price + 0.15);

        price = price - 0.01; // 1.39
        System.out.println(price);

        double total = price * 3; // double ���͵ļ��㣬�õ���һ�㶼�� double ����
        System.out.println(total);

        System.out.println(price / 100); // ����

        System.out.println(price % 2); // 1 % 100 = 1
    }
}
