public class Person {
    String name;
    static String country = "����"; // ���ǹ����
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Person p1 = new Person("������",  "�˴��ͬ");
        Person p2 = new Person("��С��", "������");

        // ��������
        Person.country = "���";

        System.out.println(p1.country);
        System.out.println(p2.country);
    }
}