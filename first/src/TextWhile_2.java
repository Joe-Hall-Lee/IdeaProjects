public class TextWhile_2 {
    public static void main(String[] args) {
        /*
            // 死循环
            while (true) {
                System.out.println("还我钱！！");
            }
        */

        // 改变条件，喊 10 次
        int i = 1;

        while (i <= 10) {
            System.out.println("还我钱");
            i = i + 1;
        }

    }
}