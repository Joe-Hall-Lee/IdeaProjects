public class TestMethod5 {

    /*
     * 用来比较两个数据的大小，返回大的那个
     * @param a 第一个数
     * @param b 第二个数
     * @return 比较大的数
     * */
    public static int compare(int a, int b) {
//        if (a > b) {
//            return a;
//        } else {
//            return b;
//        }
        // 三元表达式，三目运算符
        // x ? y : z
        int m = (a > b) ? a : b; // 不要特别依赖
        return m;
    }

    public static void main(String[] args) {
//        int c = compare(1, 6);
//        System.out.println(c);
        System.out.println(compare(1, 6));

    }
}