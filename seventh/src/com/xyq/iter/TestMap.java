package com.xyq.iter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("С���", "���׷�");
        map.put("С����", "��С��ͯ");
        map.put("С����", "���ෲ");
        map.put("С����", "������");

        // ����һ
//        Set set = map.keySet(); // �õ����е� key
//        Iterator it = set.iterator(); // �õ�������
//
//        while (it.hasNext()) {
//            String key = (String) it.next(); // ���е� key
//            System.out.println(map.get(key)); // ͨ�� key ��ȡ�� value
//        }

        // ������
        Set set = map.entrySet(); // set ����װ���� entry
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}