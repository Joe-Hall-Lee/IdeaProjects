package com.xyq.str;

public class Test3 {

    public static void main(String[] args) {
        String[] stus = {"小绿_数学_12_语文_33_英语_42", "钢管男_数学_25_语文_56_英语_27", "泰斯波尔_数学_99_语文_88_英语_120"};


        for (int i = 0; i < stus.length; i++) { // 数组 length 没有括号
            String s = stus[i];

            String[] ss = s.split("_"); // 小绿, 数学, 12, 语文, 33, 英语, 42

            String name = ss[0];
            String shuxue = ss[2];
            String yuwen = ss[4];
            String yingyu = ss[6];

            double avq = (Integer.parseInt(shuxue) + Integer.parseInt(yuwen) + Integer.parseInt(yingyu)) / 3.0;

            System.out.println(name + "的平均分是" + avq);


        }
    }
}