public class Test {

//    public static void change(int b) {
//        b = 20;
//    }


    public static void change(Cat c) {
        c.name = "��è";
    }

    public static void main(String[] args) {
        Cat c = new Cat("��è");
        change(c);
        System.out.println(c.name);


//        int a = 10;
//        change(a);
//
//        System.out.println(a);
    }
}