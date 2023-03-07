public class TestBreak {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 10) {
                break; // 彻底地终止这个循环
            }
            System.out.println(i);
        }
    }
}