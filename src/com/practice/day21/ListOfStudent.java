package com.practice.day21;

import java.util.ArrayList;
import java.util.List;

public class ListOfStudent {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("gopi");
        list.add("sai");
        list.add("shekar");
        list.add("sasi");
        list.add("raju");
        list.set(3, "god");
        printStudentNames(list);
        System.out.println(list);
    }

    public static void printStudentNames(List<String> list) {
        for (String names : list) {
            System.out.println(names);
        }
    }

}
