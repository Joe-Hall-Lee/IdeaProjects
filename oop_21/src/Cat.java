public class Cat {

    String name;
    String color;

    public boolean equals(Cat c) {
        if (this.color == c.color) { // �������Լ�ȥд�жϵ��߼�
            return true;
        } else{
            return false;
        }
    }

    public Cat(String name, String color) {
        this.color = color;
        this.name = name;
    }

    public static void main(String[] args) {
        Cat c1 = new Cat("С��", "��ɫ");
        Cat c2 = new Cat("С��", "��ɫ");

        // System.out.println(c1 == c2); // false Ĭ���жϵ�������������ڴ��ַ�Ƿ�һ�£�һ�����ڻ�������������
        // System.out.println(c1.equals(c2)); // Ĭ�ϵ��õ��� Object �ṩ�� equals ���� false
        System.out.println(c1.equals(c2)); // �õ����� true����ʱ���õ������е� equals ����
    }
}