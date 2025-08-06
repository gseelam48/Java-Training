package com.practice.day25;

import java.util.*;

public class HashMapArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(6666);
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
        Iterator iterator1 = list.iterator();
        while (iterator.hasNext()) {
            Integer value = (Integer) iterator.next();
            iterator.remove();
        }
        System.out.println("after removing list size---->" + list.size());
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("forward direction" + listIterator.next());
        }
        while (listIterator.hasPrevious()) {
            System.out.println("backward direction" + listIterator.previous());
        }

    }
}
// java 8 features
// stream
// iterator or listiterator to traverse the eliments one by one.
