public class Cat {

    String name;
    String color;

    public boolean equals(Cat c) {
        if (this.color == c.color) { // 单纯地自己去写判断的逻辑
            return true;
        } else{
            return false;
        }
    }

    public Cat(String name, String color) {
        this.color = color;
        this.name = name;
    }

    public static void main(String[] args) {
        Cat c1 = new Cat("小花", "红色");
        Cat c2 = new Cat("小花", "红色");

        // System.out.println(c1 == c2); // false 默认判断的是两个对象的内存地址是否一致，一般用在基本数据类型上
        // System.out.println(c1.equals(c2)); // 默认调用的是 Object 提供的 equals 方法 false
        System.out.println(c1.equals(c2)); // 得到的是 true，此时调用的子类中的 equals 方法
    }
}