public class Test {

    public static void main(String[] args) {
//        String str1 = "小红";
//        String str2 = "小红"; // 第二次的小红并没有单独占用内存空间
//
//        System.out.println(str1 == str2);
//        System.out.println(str1.equals(str2));

        String str3 = new String("钢精");
        String str4 = new String("钢精");

        System.out.println(str3 == str4); // false
        System.out.println(str3.equals(str4)); // true 判断两个字符串的内容是否一致
    }
}