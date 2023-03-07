import java.util.Scanner;

public class TestIf_1 {
    public static void main(String[] args) {
        System.out.println("请告诉我你兜里的钱：");
        Scanner sc = new Scanner(System.in);

        // 获取到钱
        double money = sc.nextDouble();

        // 洗浴要用的钱
        double price = 1000;

        // 条件判断
        if (money > price) {
            System.out.println("岳哥，你可以去 happy 了");
        }

        System.out.println("练剑");
    }
}
