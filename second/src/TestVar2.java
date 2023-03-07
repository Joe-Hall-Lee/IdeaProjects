public class TestVar2 {
    public static void main(String[] args) {
        float a = 0.1234567890123456f; // 最多保留小数点后 8 位
        System.out.println(a);

        double d = 0.1234567890123456789999999;
        System.out.println(d); // 最多保留小数点后 17 位
    }
}
