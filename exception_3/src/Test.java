import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test {

//    public static void read() throws Exception { // 表示当前这个方法会扔出来 Exception 这样的错误
//
//        InputStream is = new FileInputStream(new File("哈哈哈"));
//    }

    public static void chu(int a, int b) throws Exception { // 告诉外面，我要扔出来一个错误
        if (b == 0) {
            throw new Exception("你不可以给我一个 0"); // 真正地向外抛出一个异常
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