public class LiShiMin extends LiYuan {

    // 子类中的方法必须和父类中的方法完全一致
    public void makeCountry() {
        // 半盖
        super.makeCountry(); // super 可以调用父类中被重写了的方法
        System.out.println("李世民也想建立一个自己的国家");
    }

    public static void main(String[] args) {
        LiShiMin lsm = new LiShiMin();
        lsm.makeCountry();
    }
}