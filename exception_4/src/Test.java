public class Test {
    public static void main(String[] args) throws GenderException {
        Person p1 = new Person("���޼�", "��");

        Person p2 = new Person("����", "Ů");

        ZaoTangZi ztz = new ZaoTangZi();

        ztz.nan(p2);
    }
}