public class TestMethod2 {

    /*
     * ������һ��������Լ��
     * ֻ�Ƕ��巽������û�е���
     * */
    public static void yue() {
        System.out.println("1���ó��ֻ�");
        System.out.println("2����İİ");
        System.out.println("3����һ�����ǵ� TA");
        System.out.println("4�����������죬������Ӱ");
    }

    /*
     * дһ���� 1 ���� 100 �ķ���
     * */
    public static void count100() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    // ������������������������
    public static void main(String[] args) {

//        System.out.println("��Ҫ��ʼԼ�˰���");
//        // ���÷���
//        yue(); // ����Լ

//        System.out.println("ˬ��");
        count100();
        yue();
        count100();
        yue();
    }
}