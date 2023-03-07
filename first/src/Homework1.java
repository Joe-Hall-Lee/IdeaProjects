import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(100); // n 是一个随机数，范围是 [0, 99]

        Scanner sc = new Scanner(System.in);

        boolean flag = true; // 准备一个状态

        while (flag) {
            System.out.println("请输入一个数字 a：");
            int a = sc.nextInt();

            // 判断
            if (a > n) {
                System.out.println("对不起，猜大了");
            } else if (a < n) {
                System.out.println("对不起，猜小了");
            } else { // 等于
                System.out.println("恭喜你，猜对了");
                flag = false;
            }
        }

    }
}