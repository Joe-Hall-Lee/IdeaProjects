package com.xyq.fan;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // List<String> strList = new ArrayList<String>();

        // strList.add("蔡徐坤坤");
        // strList.add(123); // 不可以装 int
        // strList.add("吴亦凡凡");
        // strList.add("李易峰峰");

        // String s = strList.get(1); // 不需要强转了

        // System.out.println(s);

//        List<Singer> list = new ArrayList<Singer>();
//
//        list.add(new Singer(1, "蔡徐坤", 1.25, "只因你太美"));
//        list.add(new Singer(2, "吴亦凡", 1.25, "又大又圆"));
//        list.add(new Singer(3, "鹿晗", 1.25, "sorry"));
//        list.add(new Singer(4, "李易峰", 1.25, "sorry"));
//
//        Iterator<Singer> it = list.iterator();
//
//        while (it.hasNext()) {
//            Singer s = it.next();
//            System.out.println(s.getName());
//            System.out.println(s.getSong());
//        }

        Map<String, String> map = new HashMap<String, String>();

        map.put("老坛酸菜", "我的最爱");
        map.put("红烧牛肉", "吃吐了");
        map.put("西红柿打卤", "我唱最难吃的泡面");

        map.put("海鲜", "这个还凑合吧");

        String s = map.get("老坛酸菜");
        System.out.println(s);
    }
}