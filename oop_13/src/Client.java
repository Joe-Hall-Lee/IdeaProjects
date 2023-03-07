public class Client {
    public static void main(String[] args) {
//        Cat c = new Cat();
//        Dog d = new Dog();
//
//        Person p = new Person();
//
//        p.feedCat(c);
//        p.feedDog(d);


//        Cat c = new Cat(); // 创建一只猫
        Animal ani1 = new Cat(); // 可以把猫当成动物来看，把子类的对象赋值给父类的引用（变量）向上转型，会屏蔽掉子类中特有的方法
        Animal ani2 = new Dog();
        Animal ani3 = new DaXiang();

        // ani1.catchMouse(); // 站在动物的角度是不能抓老鼠的

//        Person p = new Person();
//        p.feed(ani1);
//        p.feed(ani2);
//        p.feed(ani3);

        // 多态：把不同的数据类型进行统一

        // 向下转型
        Cat cc = (Cat) ani1;
        cc.catchMouse(); // 猫又可以抓老鼠了
    }
}