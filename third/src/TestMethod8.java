public class TestMethod8 {

    public static void add(int a, int b) {
        System.out.println("���� int");
        System.out.println(a + b);
    }

    public static void add(double a, double b) {
        System.out.println("���� double");
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        add(1.5, 4.2);
    }
}