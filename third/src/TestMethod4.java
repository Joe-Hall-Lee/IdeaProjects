public class TestMethod4 {
    public static void yue(String tools, String style) {
        System.out.println("1．拿出手机");
        System.out.println("2．打开" + tools);
        System.out.println("3．找一个" + style + "的 TA");
        System.out.println("4．出来聊聊天，看看电影");
    }

    public static void main(String[] args) {
        // 用陌陌约一次，再用探探约一次
        yue("陌陌", "丰满");
        yue("探探", "对 A ");
    }
}