package com.xyq.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set s = new HashSet();

        s.add("123");
        s.add("147");
        s.add("3"); // int -> Integer

        s.add("6"); // 重复的数据添加不进去

        System.out.println(s.size());

        s.remove(147);
        System.out.println(s);

        System.out.println(s.contains("3"));
    }
}