public class Test {
//    String name;
//
//    public static void chi(){
//        System.out.println(this.name); // ������������
//    }
//
//    {
//        System.out.println("������ͨ�ù�����");
//    }
//    static {
//        System.out.println("��̬������");
//    }
//
//    public Test() {
//        System.out.println("���췽��");
//    }

    public static void pen() {
        System.out.println("����Ǯ");
    }

    public static void main(String[] args) {
        pen(); // �ھ�̬��������þ�̬�Ķ����ǿ��Ե�
        Test.pen(); // ʹ������ȥ���ʾ�̬����
    }
}