package com.xyq.iter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("蔡徐坤");
        list.add("吴亦凡");
        list.add("李易峰");
        list.add("鹿晗");

        // 创建迭代器，创建一个医生
        Iterator it = list.iterator();

//        String s0 = (String) it.next(); // 第一个
//        System.out.println(s0);
//        String s1 = (String) it.next(); // 下一个
//        System.out.println(s1);
//        String s2 = (String) it.next(); // 下一个
//        System.out.println(s2);
//        String s3 = (String) it.next(); // 下一个
//        System.out.println(s3);
//
//        String s4 = (String) it.next(); // 没有元素了，再叫下一个，没人了，报错了
//        System.out.println(s4);

        while (it.hasNext()) { // 判断有没有下一个元素
            String s = (String) it.next(); // 拿下一个元素
            System.out.println(s);
        }

        System.out.println(it.next());
    }
}