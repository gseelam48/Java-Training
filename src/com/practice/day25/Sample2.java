package com.practice.day25;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sample2 {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("Gopi");
        names.add("Gopi1");
        names.add("Gopi2");
        names.add("Gopi3");
        printNames(names);
        System.out.println(names.size());

    }

    public static void printNames(Set<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
