public class SunWuKong extends Hero {

    String name = "���ʥ";

    public SunWuKong() {
        // super(); // Ĭ�ϵ�
        super("�����"); // ��ԭ���������๹�췽���ĵ�һ�У�Ĭ�ϵ��ø���Ĺ��췽��
        System.out.println("��������Ĺ��췽��");
    }

    public void chi() {
        // �뿴�������е� name
        System.out.println(super.name);
        // �����Լ��࣬Ȼ���Ҹ���
        System.out.println(this.name + "�ڳ�����");
    }

    public static void main(String[] args) {
        SunWuKong s = new SunWuKong();
        s.chi();
    }
}