public class Car {
    String color;
    int speed;
    int seat = 5;

    public void run() {
        // Ĭ�ϻ���һ�� this����ǰ����ִ����������Ķ���
        // ��ȡ��������ɫ���ٶ�
        // System.out.println(this);
        System.out.println(this.color);
        System.out.println(this.speed);
        System.out.println("������");
    }

    public void fly(String color) {
        System.out.println(this.color + "��ɫ�ĳ���ɣ�����" + color + "��ɫ���Ʋ���"); // ��ʱ���ʵ�Ҳ�ǳ�Ա����
        // �����Ĳ���˳�������Լ������ڣ�����Լ�û�У���ȥ this ������
    }

    public static void main(String[] args) {
        // Car c = new Car();
        // c.color = "��ɫ";
        // c.speed = 120;

        // c.run(); // �ڵ��÷�����ʱ��Java ���Զ��ذѶ��󴫵ݸ��������ڷ������� this �����ն���
        // System.out.println(c);
        // System.out.println(c.color);

        // Car c2 = new Car(); // ���е����Ծ������ж���õĳ�Ա����
        // c2.color = "��ɫ";
        // c2.speed = 180;

        // c2.run();

        // this ���԰��������ֳ�Ա�����;ֲ�����
        Car c = new Car();
        c.color = "��ɫ";

        c.fly("��ɫ");
    }
}