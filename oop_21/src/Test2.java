import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        String username = "admin";
        String password = "123";

        Scanner sc = new Scanner(System.in);

        System.out.println("�������û�����");

        String uname = sc.nextLine();

        System.out.println("���������룺");

        String upwd = sc.nextLine();

        // �ж��û����������Ƿ� OK
        if (uname.equals(username) &&upwd.equals(password)) {
            System.out.println("��¼�ɹ�");
        } else{
            System.out.println("��¼ʧ��");
        }
    }
}