public class Cat extends Animal{

    public static void main(String[] args) {
        Animal ani = new Animal();

        if (ani instanceof Cat) { // 判断 ani 是否是一只猫
            System.out.println("是一只猫，撸一撸");
        } else {
            System.out.println("不是一只猫");
        }
    }
}