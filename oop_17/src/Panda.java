// ����Լ̳�һ���࣬ʵ�ֶ���ӿ�
public class Panda extends Animal implements Valuable,Protectable {

    @Override // ��д
    public void eat() {
        System.out.println("��è������");
    }

    @Override
    public void cang() {
        System.out.println("����è��ɽ��");
    }

    @Override
    public void getMoney() {
        System.out.println("��è���Ի�Ǯ");
    }
}