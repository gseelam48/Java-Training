package com.practice.day23;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Employee employee = new Employee(2345, "gopi", " 7201 s custer");
        Employee employee1 = new Employee(2346, "gopi1", " 7201 s custer1");
        Employee employee2 = new Employee(2347, "gopi2", " 7201 s custer2");
        Map<String, Employee> map = new LinkedHashMap<>();
        map.put("gopi", employee);
        map.put("gopi1", employee1);
        map.put("gopi2", employee2);
        Map1 map1 = new Map1();
        map1.printDetails(map);

    }

    public void printDetails(Map<String, Employee> map) {
        for (Map.Entry<String, Employee> m : map.entrySet()) {
            System.out.println(m.getKey() + m.getValue().getId() + m.getValue().getAddress() + m.getValue().getName());
        }
    }
}

class Employee {
    int Id;
    String name;
    String address;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(int id, String name, String address) {
        Id = id;
        this.name = name;
        this.address = address;
    }
}
