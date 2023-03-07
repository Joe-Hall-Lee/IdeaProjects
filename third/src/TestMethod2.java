public class TestMethod2 {

    /*
     * 定义了一个方法“约”
     * 只是定义方法，并没有调用
     * */
    public static void yue() {
        System.out.println("1．拿出手机");
        System.out.println("2．打开陌陌");
        System.out.println("3．找一个心仪的 TA");
        System.out.println("4．出来聊聊天，看看电影");
    }

    /*
     * 写一个从 1 数到 100 的方法
     * */
    public static void count100() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    // 主方法、主函数、程序的入口
    public static void main(String[] args) {

//        System.out.println("我要开始约了啊。");
//        // 调用方法
//        yue(); // 调用约

//        System.out.println("爽！");
        count100();
        yue();
        count100();
        yue();
    }
}