import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("������Ҫ���ӵ����ݿ�����һ����1��MySql��2��Oracle)��");

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        IDAO dao; // ��������������
        if (n == 1) {

            dao = new MySqlDao();

        } else {
            dao = new OracalDao();
        }

        dao.connect();
        dao.add();
        dao.del();
        dao.upd();
        dao.sel();

    }
}