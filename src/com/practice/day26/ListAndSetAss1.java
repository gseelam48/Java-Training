package com.practice.day26;

import java.util.ArrayList;
import java.util.List;

public class ListAndSetAss1 {
    public static void main(String[] args) {
        Student student = new Student("gopi", 234, 100);
        Student student1 = new Student("rutesh", 235, 200);
        Student student2 = new Student("srinu", 235, 300);
        Student student3 = new Student("raja", 235, 400);
        Student student4 = new Student("chithu", 238, 500);
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        ListAndSetAss1 listAndSetAss1 = new ListAndSetAss1();
        listAndSetAss1.printStudentMarks(list);


    }

    public void printStudentMarks(List<Student> list) {
        for (Student st : list) {
            System.out.println(st.getName() + st.getId() + st.getMarks());
        }
    }
}

class Student {
    String name;
    int id;
    int marks;

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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student() {

    }

    public Student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
}