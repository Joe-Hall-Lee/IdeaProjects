public class Car {
    String color;
    int speed;
    int seat = 5;

    // Java ���Զ������͸�ÿһ����һ���޲����Ĺ��췽��
    // ������Լ������˹��췽����Java �Ͳ�����������
    // �ڴ��������ʱ���Զ����÷���
    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public void run() {
        System.out.println(this.color + "��ɫ�ĳ�����");
    }

    public static void main(String[] args) {
        Car c1 = new Car("��", 120); // Ĭ�ϵ��õ��ǹ��췽��
        // c1.color = "��";
        // c1.speed = 120;

        Car c2 = new Car("��", 180);
        // c2.color = "��";
        // c2.speed = 100;


        c1.run();
        c2.run();
    }
}