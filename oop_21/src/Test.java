public class Test {

    public static void main(String[] args) {
//        String str1 = "С��";
//        String str2 = "С��"; // �ڶ��ε�С�첢û�е���ռ���ڴ�ռ�
//
//        System.out.println(str1 == str2);
//        System.out.println(str1.equals(str2));

        String str3 = new String("�־�");
        String str4 = new String("�־�");

        System.out.println(str3 == str4); // false
        System.out.println(str3.equals(str4)); // true �ж������ַ����������Ƿ�һ��
    }
}