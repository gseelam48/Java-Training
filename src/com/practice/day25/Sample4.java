package com.practice.day25;

import java.util.ArrayList;
import java.util.List;

public class Sample4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("gopi");
        list.add("srinu");
        list.add("srinu1");
        list.add("srinu2");
        Sample4 sample4 = new Sample4();
        System.out.println(sample4.sizeOfArray(list));
    }

    public int sizeOfArray(List<String> list) {
        return list.size();

    }

}
