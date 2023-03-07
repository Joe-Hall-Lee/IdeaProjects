/*
* 能继承接口的只能是接口，
* 接口和类只能是实现关系 implements
* */
public interface Valuable { // 接口使用 interface 来声明，已经不再是类了

    public static final int money = 100;

    // 接口中所有的方法都是抽象方法，可以省略掉 abstract
    // 接口中所有的内容都是公开的，公共的
    void getMoney(); // 接口中所有的方法都是抽象方法，不可以有正常的方法
}