public class Car {
    // ��Ա����
    String color; // ��ɫ
    int speed; // �ٶ�
    int seat = 5; // ��λ

    // ��Ա����
    public void run() {
        System.out.println("������");
    }

    public void fly() {
        System.out.println("�����");
    }

    public static void main(String[] args) {
        // int a = 10; // д�ڷ�����ı������ֲ�����

        // ��������
        // int a = 10;
        // String color = "�Ǻ�"

        // ���������������������û���г��ģ����ֱ�������Ϊ����
        // Java ��Ϊ�����������ͣ�1�������������� 2�������������� String �����Ǵ�����������
        Car c = new Car(); // �������󣬴�����һ��������������������������Ҫʹ�� c ������

        // �ó�ȥ��
        // �����������.����()
        c.run(); // . ��ʾ���ã����ġ�

        c.color = "��ɫ";
        c.speed = 120;

        // c.pailiang = 1.5; // ����û�ж�������ݲ�����ʹ��

        System.out.println(c.color);

        Car c2 = new Car();
        c2.color = "��ɫ";
        c2.speed = 180;

        System.out.println(c.seat);
        System.out.println(c2.seat);

        System.out.println(c.color);
        System.out.println(c2.color);

        c.fly();
    }
}