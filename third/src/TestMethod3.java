public class TestMethod3 {
    public static String buy() { // 注意返回值类型
        System.out.println("我要去买烟了");
        // 需要使用 return 进行返回
        return "中华香烟"; // 返回值类型和返回值必须匹配
    }

    public static void main(String[] args) {
        // buy(); // 没有接受返回值
        // 返回值返回给调用方

        String yan = buy(); // 接受返回值
        System.out.println("得到的返回值是" + yan);
    }
}
