package com.practice.day25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(6666);
        printDataWithFor(list);
        System.out.println("Printing using for,foreach,iterator----> "   + list.size());
    }

    public static void printDataWithFor(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list size ----->" + list.get(i));
        }
        for (Integer i : list) {
            System.out.println("eliments size------> " + i);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
