package com.xyq.testfor;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        String[] arr = {"hello", "ÄãºÃ", "ÈøÍßµÏ¿¨", "Å·¹şÒÑÓĞ"};

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        for (String s : arr) {
//            System.out.println(s);
//        }

        List<Integer> lst = new ArrayList<Integer>();
        lst.add(123);
        lst.add(456);
        lst.add(789);

        for (Integer obj : lst) {
            System.out.println(obj + 100);
        }
    }
}