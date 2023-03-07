public class Var2 {
    public static void main(String[] args) {
        double price = 1.25;

        System.out.println(price);

        // 岳哥 = 10086;
        // 岳哥 = 10010;
        // 涨价了 1.4 了
        price = price + 0.15; // = 表示赋值

        System.out.println(price + 0.15);

        price = price - 0.01; // 1.39
        System.out.println(price);

        double total = price * 3; // double 类型的计算，得到的一般都是 double 类型
        System.out.println(total);

        System.out.println(price / 100); // 除法

        System.out.println(price % 2); // 1 % 100 = 1
    }
}
