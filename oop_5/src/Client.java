public class Client {
    public static void main(String[] args) {
        // ����ֲ��ͽ�ʬ
        ZhiWu zw = new ZhiWu("�㶹", 1000, 5);

        JiangShi js = new JiangShi("��Ͱ��ʬ", 800, 20);

        zw.fight(js);
    }
}