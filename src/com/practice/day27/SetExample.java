package com.practice.day27;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
      //  Map<String,Student> map = new HashMap<>();
        System.out.println("------------");
        Student student = new Student(12,"gopi");
        Student student1 = new Student(12,"gopi");
       // System.out.println("---------");
        set.add(student);
//map.put("gopi",student);

      //  System.out.println("************");
        set.add(student1);
       // map.put("gopi",student1);

        System.out.println("Student set size " + set.size());
       // System.out.println("Student map size " + map.size());
    }
}
