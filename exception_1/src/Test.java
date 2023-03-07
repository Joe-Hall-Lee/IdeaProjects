public class Test {

    public static void main(String[] args) {
        System.out.println(1 / 0); // 0 不能做除数

        System.out.println("呵呵");

        // 1．异常是错误，运行时异常
        // 2．抛异常
        // 3．捕获异常，默认由 JVM 来把错误信息进行捕获，打印出来，JVM 会终止程序的执行
    }
}