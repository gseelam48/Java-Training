package com.practice.day25;

import java.util.LinkedHashMap;
import java.util.Map;

public class Sample5 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("gopi", "srinu");
        map.put("gopi1", "srinu1");
        map.put("gopi2", "srinu2");
        Sample5 sample5 = new Sample5();
        System.out.println(sample5.printSize(map));

    }

    public int printSize(Map<String, String> map) {
        return map.size();
    }
}
