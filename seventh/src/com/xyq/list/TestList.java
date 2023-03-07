package com.xyq.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List list = new LinkedList();

        list.add("福满多");
        list.add("小当家");
        list.add("康师傅");
        list.add("康帅傅");

//        System.out.println(list);
//
//        list.remove("小当家");
//        System.out.println(list);
//
//        System.out.println(list.size());
//
//        Object obj = list.get(1); // 列表的下标也是从 0 开始的
//        String s = (String)obj;
//
//        System.out.println(s);
//
//        System.out.println(list.contains("康傅"));


        for (int i = 0; i < list.size(); i++) {
            String s = (String) list.get(i); // 向下转型，强转
            System.out.println(s);
        }
    }
}