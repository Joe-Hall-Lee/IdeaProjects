public class TestArray2 {
    public static void main(String[] args) {

        int[] arr = {37, 24, 12, 11, 8, 20};

        /**
         * 37 + 28 = 65
         * 65 + 12 = 77
         * 77 + 11 = 88
         * 88 + 8 = 96
         * 96 + 20 = 116
         */
        int sum = 0; // 37 + 28 = 65 + 12 = 77

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i]; // ÀÛ¼ÓÔËËã
        }

        System.out.println(sum);
    }
}
