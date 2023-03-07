public class TestArray {
    public static void main(String[] args) {

        // int[] arr1 = new int[5];

        // int[] arr2 = {33, 22, 18, 27};

        // int[] arr3 = new int[]{33, 22, 18, 27};


        int[] arr4 = {18, 27, 19, 3, 5, 76};

        // System.out.println(arr4[0]); // 从数组 arr4 中获取到第 0 位置的数据

        // arr4[1] = 88; // 通过下标修改数组中的数据

        // System.out.println(arr4[1]);


        int[] arr5 = {18, 27, 19, 3, 5, 76, 99};

//        System.out.println(arr5[0]);
//        System.out.println(arr5[1]);
//        System.out.println(arr5[2]);
//        System.out.println(arr5[3]);
//        System.out.println(arr5[4]);
//        System.out.println(arr5[5]);

        for (int i = 0; i < arr5.length; i++) { // arr5.length 表示数组中有多少个数据 —> 数组的长度
            System.out.println(arr5[i]);
        }
    }
}