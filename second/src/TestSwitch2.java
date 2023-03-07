import java.util.Scanner;

public class TestSwitch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("第一季度");
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("第二季度");
                break;

            case 7:
            case 8:
            case 9:
                System.out.println("第三季度");
                break;
        }
    }
}