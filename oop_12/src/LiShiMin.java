public class LiShiMin extends LiYuan {

    // �����еķ�������͸����еķ�����ȫһ��
    public void makeCountry() {
        // ���
        super.makeCountry(); // super ���Ե��ø����б���д�˵ķ���
        System.out.println("������Ҳ�뽨��һ���Լ��Ĺ���");
    }

    public static void main(String[] args) {
        LiShiMin lsm = new LiShiMin();
        lsm.makeCountry();
    }
}