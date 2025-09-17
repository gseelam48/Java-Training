package com.practice.day22;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {
    public static void main(String[] args) {
        Set<String> set  = new HashSet<>();
        set.add("Mylavaram");
        set.add("Sac");
        set.add("Rancho");
        set.add("Berkeley");
        set.add("San");
        set.add("roseville");
        printDuplicate(set);
        System.out.println(set.contains("Berkeley"));
        System.out.println(set);


    }
    public static void printDuplicate(Set<String> set){
        for(String s : set){
            System.out.println(s);
        }
    }

}
