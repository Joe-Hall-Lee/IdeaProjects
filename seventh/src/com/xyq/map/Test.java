package com.xyq.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
//        Map map = new HashMap();
//
//        map.put("jay", "�ܽ���");
//        map.put("wf", "����");
//        map.put("tz", "�Ն�");
//        map.put("zbc", "�ܱʳ�");
//
//        System.out.println(map);

        Map map = new TreeMap(); // ���� key ����
        map.put(11, "�ܽ���");
        map.put(33, "������");
        map.put(66, "��С��ͯ");
        map.put(22, "����");

        map.put(33, "ֻ����̫��");

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
//        System.out.println(map.containsValue("�ܽ���"));

    }
}