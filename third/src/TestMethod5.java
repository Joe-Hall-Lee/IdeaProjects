public class TestMethod5 {

    /*
     * �����Ƚ��������ݵĴ�С�����ش���Ǹ�
     * @param a ��һ����
     * @param b �ڶ�����
     * @return �Ƚϴ����
     * */
    public static int compare(int a, int b) {
//        if (a > b) {
//            return a;
//        } else {
//            return b;
//        }
        // ��Ԫ���ʽ����Ŀ�����
        // x ? y : z
        int m = (a > b) ? a : b; // ��Ҫ�ر�����
        return m;
    }

    public static void main(String[] args) {
//        int c = compare(1, 6);
//        System.out.println(c);
        System.out.println(compare(1, 6));

    }
}