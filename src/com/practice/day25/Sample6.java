package com.practice.day25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample6 {
    public static void main(String[] args) {
        Student student = new Student("Gopi", 23456, "2344 w newport way");
        Student student1 = new Student("Gopi1", 23457, "2343 w newport way");
        Student student2 = new Student("Gopi2", 23458, "2345 w newport way");
        Map<String, Student> map = new HashMap<>();
        map.put("gopi", student);
        map.put("srinu", student1);
        map.put("rutesh", student2);
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        Sample6 sample6 = new Sample6();
        sample6.printStudentDetails(list);
        sample6.printDetails(map);

    }

    public void printStudentDetails(List<Student> list) {
        for (Student s : list) {
            System.out.println(s.getName() + s.getId() + s.getAddress());
        }

    }

    public void printDetails(Map<String, Student> map) {
        for (Map.Entry<String, Student> m : map.entrySet()) {
            System.out.println(m.getKey() + m.getValue().getId());
            System.out.println(m.getKey() + m.getValue().getAddress());
            System.out.println(m.getKey() + m.getValue().getName());

        }
    }
}

class Student {
    String name;
    int id;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student() {

    }

    public Student(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

}

