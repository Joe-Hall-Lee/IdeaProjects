import java.util.Scanner;

public class TextIf_3 {
    public static void main(String[] args) {
        System.out.println("请告诉我你兜里的钱：");
        Scanner sc = new Scanner(System.in);

        // 获取到钱
        double money = sc.nextDouble();


        if (money > 1000) {
            System.out.println("洗浴中心最 happy");
        } else if (money > 500) {
            System.out.println("洗脚城也不错");
        } else if (money > 200) {
            System.out.println("串大街，过小巷");
        } else {
            System.out.println("左手右手一个慢动作");
        }

        System.out.println("练剑");
    }
}
