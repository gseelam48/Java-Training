package com.practice.day25;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Gopi");
        list.add("rutesh");
        list.add("raja");
        list.add("srinu");
        stringList(list);
        System.out.println(list.size());

    }

    public static void stringList(List<String> list) {

        for (String i : list) {
            System.out.println("String list---> " + i);
        }
    }
}
