public class Test {

    public static void main(String[] args) {
        try {
            System.out.println(1 / 1);
        } catch (Exception e) {
            // e.printStackTrace(); // ��ӡ������Ϣ
            System.out.println("ϵͳ�����ˣ�����ϵ����Ա"); // ���ͻ�����
        } finally {
            System.out.println("��ð������� finally");
        }
    }
}