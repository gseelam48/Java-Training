package com.practice.day19;

public class NullPointException {
    public static void main(String[] args) {
        Employee employee = null;
        System.out.println(employee.getAge());
        for (int i = 0; ; ) {
            System.out.println(i);
        }
    }
}

// null point exception is an unchecked exception
class Employee {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}