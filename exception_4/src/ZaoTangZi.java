public class ZaoTangZi {

    public void nan(Person p) throws GenderException {
        if (p.gender.equals("��")) {
            System.out.println("��ӭ����");
        } else { // ���˸�Ů��
            // ��Ҫ�׳�һ���쳣
            throw new GenderException("�Ա𲻶ԣ���������������");
        }
    }
}