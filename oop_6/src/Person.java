public class Person {
    String name;
    static String country = "大清"; // 它是共享的
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Person p1 = new Person("赵铁柱",  "八大胡同");
        Person p2 = new Person("李小华", "朝阳门");

        // 大清亡了
        Person.country = "民国";

        System.out.println(p1.country);
        System.out.println(p2.country);
    }
}