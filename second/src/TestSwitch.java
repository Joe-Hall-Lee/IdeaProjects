import java.util.Scanner;

public class TestSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

//        if (n == 1) {
//            System.out.println("星期一");
//        } else if (n == 2) {
//            System.out.println("星期二");
//        } else if (n == 3) {
//            System.out.println("星期三");
//        } else if (n == 4) {
//            System.out.println("星期四");
//        } else if (n == 5) {
//            System.out.println("星期五");
//        } else if (n == 6) {
//            System.out.println("星期六");
//        } else if (n == 7) {
//            System.out.println("星期日");
//        } else {
//            System.out.println("胡乱输入的");
//        }

        switch (n) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("胡乱输入的");
                break;

        }
    }
}
