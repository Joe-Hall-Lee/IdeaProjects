import java.util.Scanner;

public class TextIf_2 {
    public static void main(String[] args) {
        System.out.println("请告诉我你兜里的钱：");
        Scanner sc = new Scanner(System.in);

        // 获取到钱
        double money = sc.nextDouble();
        if (money > 1000) {
            System.out.println("岳哥，你可以去 happy 了");
        } else {
            System.out.println("岳哥，你该攒钱了");
        }

        System.out.println("练剑");
    }
}
