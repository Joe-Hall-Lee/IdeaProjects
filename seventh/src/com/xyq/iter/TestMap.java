package com.xyq.iter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("小峰峰", "李易峰");
        map.put("小六六", "六小龄童");
        map.put("小凡凡", "吴亦凡");
        map.put("小坤坤", "蔡徐坤");

        // 方案一
//        Set set = map.keySet(); // 拿到所有的 key
//        Iterator it = set.iterator(); // 拿到迭代器
//
//        while (it.hasNext()) {
//            String key = (String) it.next(); // 所有的 key
//            System.out.println(map.get(key)); // 通过 key 获取到 value
//        }

        // 方案二
        Set set = map.entrySet(); // set 里面装的是 entry
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}