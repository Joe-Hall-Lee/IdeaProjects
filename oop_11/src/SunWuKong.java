public class SunWuKong extends Hero {

    String name = "孙大圣";

    public SunWuKong() {
        // super(); // 默认的
        super("武大郎"); // 还原程序，在子类构造方法的第一行，默认调用父类的构造方法
        System.out.println("我是子类的构造方法");
    }

    public void chi() {
        // 想看到父类中的 name
        System.out.println(super.name);
        // 先找自己类，然后找父类
        System.out.println(this.name + "在吃桃子");
    }

    public static void main(String[] args) {
        SunWuKong s = new SunWuKong();
        s.chi();
    }
}