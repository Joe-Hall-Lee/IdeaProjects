public class TestArray1 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 18, 7, 99, 26};

        int max = arr[0]; // 12 初始化最大值是最开头的那个数据

        for (int i = 1; i < arr.length; i++) { // 从第 1 个位置开始比较
            if (arr[i] > max) { // 如果出现了数组中的数据比记录的 max 还大
                max = arr[i]; // 把最大值记录一下
            }
        }

        System.out.println(max);
    }
}