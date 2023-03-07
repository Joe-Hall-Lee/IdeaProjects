public abstract class Animal { // 类中如果有抽象方法，那么这个类必须是一个抽象类

    // abstract 修饰方法，这个方法就是一个抽象方法，抽象方法没有方法体，直接 ; 结束
    public abstract void eat();

    public abstract void dong();

    // 抽象类可以有正常的方法
    public void smell() {
        System.out.println("我在 smell");
    }
}