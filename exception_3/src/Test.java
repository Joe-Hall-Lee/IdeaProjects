import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test {

//    public static void read() throws Exception { // ��ʾ��ǰ����������ӳ��� Exception �����Ĵ���
//
//        InputStream is = new FileInputStream(new File("������"));
//    }

    public static void chu(int a, int b) throws Exception { // �������棬��Ҫ�ӳ���һ������
        if (b == 0) {
            throw new Exception("�㲻���Ը���һ�� 0"); // �����������׳�һ���쳣
        } else {
            System.out.println(a / b);
        }
    }

    public static void main(String[] args) {
        // read();

        try {
            chu(1, 2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}