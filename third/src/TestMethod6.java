public class TestMethod6 {

    /*
     * 接收一个数组，把数组中的数据翻转，返回
     * @param arr 接收的数组
     * @return 翻转之后的数组
     * */
    public static int[] reverse(int[] arr) {
        // 返回的是一个数组
        int[] ret = new int[arr.length];
        // 0 1 2 3 4
        // 1 4 6 5 3

        int index = 0; // ret 数组的下标
        for (int i = arr.length - 1; i >= 0; i--) { // 反着拿数据
            ret[index] = arr[i]; // 正向往里面装
            index++;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 6, 3, 2};

        int[] b = reverse(a);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
