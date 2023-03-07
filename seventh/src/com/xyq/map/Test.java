package com.xyq.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
//        Map map = new HashMap();
//
//        map.put("jay", "ÖÜ½ÜÂ×");
//        map.put("wf", "Íô·å");
//        map.put("tz", "ÌÕ†´");
//        map.put("zbc", "ÖÜ±Ê³©");
//
//        System.out.println(map);

        Map map = new TreeMap(); // ¸ù¾İ key ÅÅĞò
        map.put(11, "ÖÜ½ÜÂ×");
        map.put(33, "²ÌĞìÀ¤");
        map.put(66, "ÁùĞ¡ÁäÍ¯");
        map.put(22, "Íô·å");

        map.put(33, "Ö»ÒòÄãÌ«ÃÀ");

        System.out.println(map.get(33));


//        System.out.println(map);
//
//        System.out.println(map.keySet());
//        System.out.println(map);
//
//        System.out.println(map.size());
//
//        map.remove(33);
//        System.out.println(map);
//
//        System.out.println(map.containsKey(11));
//        System.out.println(map.containsValue("ÖÜ½ÜÂ×"));

    }
}