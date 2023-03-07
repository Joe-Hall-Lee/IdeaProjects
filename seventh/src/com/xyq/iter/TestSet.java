package com.xyq.iter;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Ð¡À¤À¤");
        set.add("Ð¡·²·²");
        set.add("Ð¡º­º­");
        set.add("Ð¡·å·å");

        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}