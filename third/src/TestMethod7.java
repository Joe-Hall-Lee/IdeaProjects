public class TestMethod7 {

    // ��
    public static void chi(String fan) {

        System.out.println("��" + fan);
    }

    public static void chi(String fan, String cai) {
        System.out.println("��" + fan);
        System.out.println("��" + cai);
    }

    public static void main(String[] args) {
        chi("���׷�");
        chi("С�׷�");

        chi("���׷�", "������˿");

        // chi -> 1  chi2 -> 2
    }
}