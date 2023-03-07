import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {
            // 获取到三位数的每一位
            int bai = num / 100; // 百位 298 % 100 = 98 % 10 = 9......8
            int shi = num % 100 / 10; // 十位
            int ge = num % 100 % 10; // 个位

            int sum = bai * bai * bai + shi * shi * shi + ge * ge * ge;

            if (num == sum) {
                System.out.println("水仙花数");
            } else {
                System.out.println("不是水仙花数");
            }
        } else {
            System.out.println("不是水仙花数");
        }
    }
}
