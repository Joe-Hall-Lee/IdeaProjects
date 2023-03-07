public class DaXia {
    String name;
    String waihao;
    int age;
    String bangPai;


    // 我们需要两个构造方法
    public DaXia(String name, int age, String bangPai) {
        this.name = name;
        this.age = age;
        this.bangPai = bangPai;
    }

    // 构造方法也是方法，也可以进行重载
    // 可以让我们有更多的方式去创建对象
    public DaXia(String name, int age, String bangPai, String waihao) {

        this(name, age, bangPai); // this 还可以调用当前类中其他的构造方法

        this.waihao = waihao;
    }
    public static void main(String[] args) {

        // 岳不群
        DaXia dx1 = new DaXia("岳不群", 18, "华山派");

        // 武松
        DaXia dx2 = new DaXia("武松", 18, "梁山", "行者");
    }
}