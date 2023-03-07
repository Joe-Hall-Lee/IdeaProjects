// 类可以继承一个类，实现多个接口
public class Panda extends Animal implements Valuable,Protectable {

    @Override // 重写
    public void eat() {
        System.out.println("熊猫吃竹子");
    }

    @Override
    public void cang() {
        System.out.println("把熊猫藏山里");
    }

    @Override
    public void getMoney() {
        System.out.println("熊猫可以换钱");
    }
}