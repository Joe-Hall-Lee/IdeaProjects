public class TestMethod3 {
    public static String buy() { // ע�ⷵ��ֵ����
        System.out.println("��Ҫȥ������");
        // ��Ҫʹ�� return ���з���
        return "�л�����"; // ����ֵ���ͺͷ���ֵ����ƥ��
    }

    public static void main(String[] args) {
        // buy(); // û�н��ܷ���ֵ
        // ����ֵ���ظ����÷�

        String yan = buy(); // ���ܷ���ֵ
        System.out.println("�õ��ķ���ֵ��" + yan);
    }
}
