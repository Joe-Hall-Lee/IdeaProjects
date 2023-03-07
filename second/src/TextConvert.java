public class TextConvert {
    public static void main(String[] args) {
        int a = 10;
        long b = a; // 安全的
        System.out.println(b);

        long c = 1000000000000000000L;
        int d = (int) c; // 如果程序产生了溢出，程序就不可控了
        System.out.println(d);
    }
}
