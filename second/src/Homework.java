import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("请输入鸡的数量：");
//        int m = sc.nextInt();
//
//        System.out.println("请输入兔子的数量：");
//        int n = sc.nextInt();
//
//        int total = m * 2 + n * 4;
//        System.out.println("笼子里一共有 " + total + " 只脚");

        System.out.println("请输入脚的数量：");
        int foot = sc.nextInt();

        for (int ji = 0; ji <= foot / 2; ji++) { // 鸡
            int tu_jiao = foot - ji * 2; // 求兔子的脚

            if (tu_jiao % 4 == 0) { // 完整地组装兔子
                System.out.println("有鸡 " + ji + " 只，有兔子 " + tu_jiao / 4 + " 只");
            }
        }
    }
}