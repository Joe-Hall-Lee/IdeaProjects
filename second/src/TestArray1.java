public class TestArray1 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 18, 7, 99, 26};

        int max = arr[0]; // 12 ��ʼ�����ֵ���ͷ���Ǹ�����

        for (int i = 1; i < arr.length; i++) { // �ӵ� 1 ��λ�ÿ�ʼ�Ƚ�
            if (arr[i] > max) { // ��������������е����ݱȼ�¼�� max ����
                max = arr[i]; // �����ֵ��¼һ��
            }
        }

        System.out.println(max);
    }
}