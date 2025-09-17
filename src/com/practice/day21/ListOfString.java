package com.practice.day21;

import java.util.ArrayList;
import java.util.List;

public class ListOfString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("tree");
        list.add("water");
        list.add("plant");
        list.add("rain");
        list.add("soil");
        searchingSpecificString(list);
        System.out.println("Specific String ----->" + list.get(3));

    }

    public static void searchingSpecificString(List<String> list) {
        for (String name : list) {
            System.out.println(name);
        }
    }
}
