public class Cat extends Animal{

    public static void main(String[] args) {
        Animal ani = new Animal();

        if (ani instanceof Cat) { // �ж� ani �Ƿ���һֻè
            System.out.println("��һֻè��ߣһߣ");
        } else {
            System.out.println("����һֻè");
        }
    }
}