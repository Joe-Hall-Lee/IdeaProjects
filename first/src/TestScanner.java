import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        // 1．创建一个扫描器
        // Scanner sc = new Scanner(System.in);

        // 2．使用扫描器来获取到用户输入的内容
        // int a = sc.nextInt(); // 获取到整数
        // System.out.println(a);

        // double d = sc.nextDouble(); // 小数
        // System.out.println("d = " + d);

        // String s = sc.nextLine(); // 获取到字符串
        // System.out.println(s);

        // 让用户输入两个数，a，b，计算 a + b 的结果
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入 a 和 b：");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a + b = " + (a + b));

    }
}
