public class Test {

    public static void main(String[] args) {
        try {
            System.out.println(1 / 1);
        } catch (Exception e) {
            // e.printStackTrace(); // 打印错误信息
            System.out.println("系统出错了，请联系管理员"); // 给客户看的
        } finally {
            System.out.println("你好啊，我是 finally");
        }
    }
}