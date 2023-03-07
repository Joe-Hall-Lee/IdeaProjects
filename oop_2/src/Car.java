public class Car {
    String color;
    int speed;
    int seat = 5;

    public void run() {
        // 默认会有一个 this：当前正在执行这个方法的对象
        // 获取到车的颜色和速度
        // System.out.println(this);
        System.out.println(this.color);
        System.out.println(this.speed);
        System.out.println("车能跑");
    }

    public void fly(String color) {
        System.out.println(this.color + "颜色的车会飞，飞在" + color + "颜色的云彩里"); // 此时访问的也是成员变量
        // 变量的查找顺序：先找自己方法内，如果自己没有，就去 this 里面找
    }

    public static void main(String[] args) {
        // Car c = new Car();
        // c.color = "红色";
        // c.speed = 120;

        // c.run(); // 在调用方法的时候，Java 会自动地把对象传递给方法，在方法中由 this 来接收对象
        // System.out.println(c);
        // System.out.println(c.color);

        // Car c2 = new Car(); // 车中的属性就是类中定义好的成员变量
        // c2.color = "绿色";
        // c2.speed = 180;

        // c2.run();

        // this 可以帮我们区分成员变量和局部变量
        Car c = new Car();
        c.color = "绿色";

        c.fly("黑色");
    }
}