public class TestMethod6 {

    /*
     * ����һ�����飬�������е����ݷ�ת������
     * @param arr ���յ�����
     * @return ��ת֮�������
     * */
    public static int[] reverse(int[] arr) {
        // ���ص���һ������
        int[] ret = new int[arr.length];
        // 0 1 2 3 4
        // 1 4 6 5 3

        int index = 0; // ret ������±�
        for (int i = arr.length - 1; i >= 0; i--) { // ����������
            ret[index] = arr[i]; // ����������װ
            index++;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 6, 3, 2};

        int[] b = reverse(a);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
