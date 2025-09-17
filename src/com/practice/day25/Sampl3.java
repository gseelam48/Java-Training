package com.practice.day25;

import java.util.HashMap;
import java.util.Map;

public class Sampl3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("gopi", "rutesh");
        map.put("gopi1", "rutesh1");
        map.put("gopi2", "rutesh2");
        map.put("gopi3", "rutesh3");
        printNames(map);
        System.out.println(map.size());

    }

    public static void printNames(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
