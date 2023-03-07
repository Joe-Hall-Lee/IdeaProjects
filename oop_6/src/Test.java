public class Test {
//    String name;
//
//    public static void chi(){
//        System.out.println(this.name); // 不允许这样干
//    }
//
//    {
//        System.out.println("这里是通用构造器");
//    }
//    static {
//        System.out.println("静态构造器");
//    }
//
//    public Test() {
//        System.out.println("构造方法");
//    }

    public static void pen() {
        System.out.println("还我钱");
    }

    public static void main(String[] args) {
        pen(); // 在静态方法里调用静态的东西是可以的
        Test.pen(); // 使用类名去访问静态方法
    }
}