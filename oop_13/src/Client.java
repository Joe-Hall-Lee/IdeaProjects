public class Client {
    public static void main(String[] args) {
//        Cat c = new Cat();
//        Dog d = new Dog();
//
//        Person p = new Person();
//
//        p.feedCat(c);
//        p.feedDog(d);


//        Cat c = new Cat(); // ����һֻè
        Animal ani1 = new Cat(); // ���԰�è���ɶ���������������Ķ���ֵ����������ã�����������ת�ͣ������ε����������еķ���
        Animal ani2 = new Dog();
        Animal ani3 = new DaXiang();

        // ani1.catchMouse(); // վ�ڶ���ĽǶ��ǲ���ץ�����

//        Person p = new Person();
//        p.feed(ani1);
//        p.feed(ani2);
//        p.feed(ani3);

        // ��̬���Ѳ�ͬ���������ͽ���ͳһ

        // ����ת��
        Cat cc = (Cat) ani1;
        cc.catchMouse(); // è�ֿ���ץ������
    }
}