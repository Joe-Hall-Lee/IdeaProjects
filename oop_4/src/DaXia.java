public class DaXia {
    String name;
    String waihao;
    int age;
    String bangPai;


    // ������Ҫ�������췽��
    public DaXia(String name, int age, String bangPai) {
        this.name = name;
        this.age = age;
        this.bangPai = bangPai;
    }

    // ���췽��Ҳ�Ƿ�����Ҳ���Խ�������
    // �����������и���ķ�ʽȥ��������
    public DaXia(String name, int age, String bangPai, String waihao) {

        this(name, age, bangPai); // this �����Ե��õ�ǰ���������Ĺ��췽��

        this.waihao = waihao;
    }
    public static void main(String[] args) {

        // ����Ⱥ
        DaXia dx1 = new DaXia("����Ⱥ", 18, "��ɽ��");

        // ����
        DaXia dx2 = new DaXia("����", 18, "��ɽ", "����");
    }
}