public class Car {
    String color;
    int speed;
    int seat = 5;

    // Java 会自动地赠送给每一个类一个无参数的构造方法
    // 如果你自己定义了构造方法，Java 就不再赠送你了
    // 在创建对象的时候，自动调用方法
    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public void run() {
        System.out.println(this.color + "颜色的车在跑");
    }

    public static void main(String[] args) {
        Car c1 = new Car("绿", 120); // 默认调用的是构造方法
        // c1.color = "绿";
        // c1.speed = 120;

        Car c2 = new Car("红", 180);
        // c2.color = "红";
        // c2.speed = 100;


        c1.run();
        c2.run();
    }
}