import java.util.Scanner;

public class TestSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

//        if (n == 1) {
//            System.out.println("����һ");
//        } else if (n == 2) {
//            System.out.println("���ڶ�");
//        } else if (n == 3) {
//            System.out.println("������");
//        } else if (n == 4) {
//            System.out.println("������");
//        } else if (n == 5) {
//            System.out.println("������");
//        } else if (n == 6) {
//            System.out.println("������");
//        } else if (n == 7) {
//            System.out.println("������");
//        } else {
//            System.out.println("���������");
//        }

        switch (n) {
            case 1:
                System.out.println("����һ");
                break;
            case 2:
                System.out.println("���ڶ�");
                break;
            case 3:
                System.out.println("������");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("������");
                break;
            case 6:
                System.out.println("������");
                break;
            case 7:
                System.out.println("������");
                break;
            default:
                System.out.println("���������");
                break;

        }
    }
}
